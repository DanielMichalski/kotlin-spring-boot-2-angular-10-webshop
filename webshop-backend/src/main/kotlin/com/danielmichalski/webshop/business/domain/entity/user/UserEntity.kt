package com.danielmichalski.webshop.business.domain.entity.user

import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import com.danielmichalski.webshop.business.domain.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
class UserEntity : BaseEntity() {

    private val username: String? = null

}
