FROM maven:3.6.3-openjdk-11-slim AS build

### Build ###
LABEL maintainer="michalskidaniel2@gmail.com"
WORKDIR /usr/app/src/backend
ADD . .
RUN mvn clean package

### Run ###
FROM gcr.io/distroless/java
COPY --from=build /usr/app/src/backend/target/webshop-backend-*.jar /usr/app/backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/usr/app/backend.jar"]
