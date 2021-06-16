# Kotlin, Spring Boot 2 and Angular 10 WebShop
[![Build Status](https://github.com/DanielMichalski/kotlin-spring-boot-2-angular-10-webshop/workflows/Kotlin%20CI%20with%20Maven/badge.svg)](https://github.com/DanielMichalski/kotlin-spring-boot-2-angular-10-webshop/actions?query=workflow%3A%22Kotlin+CI+with+Maven%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/DanielMichalski/kotlin-spring-boot-2-angular-10-webshop/blob/master/LICENSE)

This project aims to present how to create and configure a Kotlin + Spring Boot 2 + Angular 10 Web application.

## Table of Contents
* [Prerequisites](#prerequisites)
* [Libraries](#libraries)
    * [Backend](#backend)
    * [Frontend](#frontend)
* [Running the application](#running-the-application)
    * [In Development mode](#in-development-mode)
    * [Using Docker](#using-docker)
* [Application access](#application-access)
* [Database access](#database-access)

## Prerequisites
- [Java JDK 8+](https://www.oracle.com/pl/java/technologies/javase-downloads.html)
- [Docker Desktop](https://www.docker.com/products/docker-desktop) 
- [Node.js](https://nodejs.org/en/) 

## Libraries
### Backend
| Library name                                                                                                     | Description                                                                                                             |
|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------ |
| [Kotlin](https://kotlinlang.org/)                                                                                | Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference.                 |
| [Spring Boot 2](https://spring.io/projects/spring-boot)                                                          | Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".    |
| [Spring Data Repositories](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories) | The JPA module of Spring Data contains a custom namespace that allows defining repository beans.                        |
| [JPA (Hibernate)](https://hibernate.org/)                                                                        | Hibernate ORM enables developers to more easily write applications whose data outlives the application process.         |
| [Liquibase](https://www.liquibase.org/)                                                                          | Liquibase Community is an open source project that helps millions of developers rapidly manage database schema changes. | 
| [Docker Compose](https://docs.docker.com/compose/)                                                               | Compose is a tool for defining and running multi-container Docker applications.                                         |
| [Lombok](https://projectlombok.org/)                                                                             | Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.       |
| [Checkstyle](https://checkstyle.sourceforge.io/)                                                                 | Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard.                 |
| [FindBugs](http://findbugs.sourceforge.net/)                                                                     | FindBugs is a development tool which uses static analysis to look for bugs in Java code.                                |

### Frontend
| Library name                                                     | Description                                                                                                                    |
|------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| [Angular 10](https://angular.io/)                                | Angular is an application design framework and development platform for creating efficient and sophisticated single-page apps. |
| [Angular Material 10](https://material.angular.io/)              | Internationalized and accessible components for everyone. Well tested to ensure performance and reliability.                   |
| [Angular Flex Layout 10](https://github.com/angular/flex-layout) | Angular Flex Layout provides a sophisticated layout API using Flexbox CSS + mediaQuery.                                        |

## Running the application
### In Development mode
#### On Windows
##### Backend
```bash
## Run PostgreSQL database on Docker
docker-compose up -d

## Build and run backend using Maven Wrapper
cd webshop-backend
mvnw.cmd clean install spring-boot:run
```
##### Frontend
```bash
## Run Frontend Angular application using npm
cd webshop-frontend
npm i
npm run start
```

#### On MacOS / Linux
##### Backend
```bash
## Run PostgreSQL database on Docker
docker-compose up -d

## Build and run backend using Maven Wrapper
cd webshop-backend
./mvnw clean install spring-boot:run
```

##### Frontend
```bash
## Run Frontend Angular application using npm
cd webshop-frontend
npm i
npm run start
```

### Whole application using Docker
#### On Windows
```bash
## Run Backend and Frontend using Docker Compose
cd local-docker
docker-compose up -d
```

#### On MacOS / Linux
```bash
## Run Backend and Frontend using Docker Compose
cd local-docker
docker-compose up -d
```

## Application access
Component             | URL                                      
---                   | ---                                      
Frontend              | http://localhost:4444                    
Backend               | http://localhost:8888                    
OpenAPI Documentation | http://localhost:8888/api/swagger-ui.html    
OpenAPI Spec          | http://localhost:8888/api/v3/api-docs        

## Database access
| URL                                          	| Username         	| Password 	|
|----------------------------------------------	|------------------	|----------	|
| jdbc:postgresql://localhost:5555/webshop 	    | webshop_user   	| secret   	|
