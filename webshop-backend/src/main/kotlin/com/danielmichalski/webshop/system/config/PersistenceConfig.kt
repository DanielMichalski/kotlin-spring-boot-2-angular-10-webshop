package com.danielmichalski.webshop.system.config

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.Database
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = ["com.danielmichalski.webshop.business.domain.entity"])
open class PersistenceConfig(private val jpaProperties: JpaProperties) {

    @Bean
    open fun entityManagerFactory(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = dataSource()
        em.setPackagesToScan(ENTITY_BASE_PACKAGE)
        em.persistenceUnitName = WEBSHOP_PERSISTENCE_UNIT_NAME
        em.jpaVendorAdapter = postgreSQLVendorAdapter()
        em.setJpaProperties(additionalProperties())
        return em
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    open fun dataSource(): DataSource {
        return DataSourceBuilder.create().build()
    }

    @Bean
    open fun transactionManager(entityManagerFactory: EntityManagerFactory?): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = entityManagerFactory
        return transactionManager
    }

    @Bean
    open fun exceptionTranslation(): PersistenceExceptionTranslationPostProcessor {
        return PersistenceExceptionTranslationPostProcessor()
    }

    private fun postgreSQLVendorAdapter(): HibernateJpaVendorAdapter {
        val vendorAdapter = HibernateJpaVendorAdapter()
        vendorAdapter.setDatabase(Database.POSTGRESQL)
        return vendorAdapter
    }

    private fun additionalProperties(): Properties {
        val properties = Properties()
        jpaProperties.properties.forEach { (key: String?, value: String?) -> properties.setProperty(key, value) }
        return properties
    }

    companion object {
        private const val ENTITY_BASE_PACKAGE = "com.danielmichalski.webshop.business.domain.entity"
        private const val WEBSHOP_PERSISTENCE_UNIT_NAME = "webshop-pu"
    }
}
