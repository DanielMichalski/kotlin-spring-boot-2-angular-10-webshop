Spring Boot 2 and Angular 10 Boilerplate
---------------------------------------------

This project aims to present how to create a Spring Boot 2 + Angular 10 Web application.

Core libraries
---------------------------------------------
- Spring Boot 2
- JPA (Hibernate)
- Liquibase
- Spring Data Repositories
- Angular 9
- Angular Material 9
- Angular Flex Layout 9
- Docker

Requirements
---------------------------------------------
- [Java JDK 8+](https://www.oracle.com/pl/java/technologies/javase-downloads.html)
- [Docker Desktop](https://www.docker.com/products/docker-desktop) 
- [Node.js](https://nodejs.org/en/) 

How to run application
---------------------------------------------
On Windows
```bash
## Run PostgreSQL database on Docker
cd backend/.docker/dependencies
start.sh

## Build backend from base directory using Maven Wrapper
cd ../../..
mvnw.cmd clean install -pl backend

## Run backend using Maven Wrapper or simly run Application class
mvnw.cmd spring-boot:run -pl backend

## Run Frontend Angular application using npm
cd frontend
npm run start
```

On MacOS/ Linux
```bash
## Run PostgreSQL database on Docker
cd backend/.docker/dependencies
./start.sh

## Build backend from base directory using Maven Wrapper
cd ../../..
./mvnw clean install -pl backend

## Run backend using Maven Wrapper or simly run Application class
./mvnw spring-boot:run -pl backend

## Run Frontend Angular application using npm
cd frontend
npm run start
```

Application access
---------------------------------------------
Component             | URL                                      
---                   | ---                                      
Frontend              | http://localhost:4444                    
Backend               | http://localhost:8888                    
OpenAPI Documentation | http://localhost:8888/api/swagger-ui.html    
OpenAPI Spec          | http://localhost:8888/api/v3/api-docs        

Database access
---------------------------------------------
| URL                                          	| Username         	| Password 	|
|----------------------------------------------	|------------------	|----------	|
| jdbc:postgresql://localhost:5555/boilerplate 	| boilerplate_user 	| secret   	|
