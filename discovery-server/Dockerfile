FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY discovery-server/pom.xml discovery-server/pom.xml
COPY discovery-server/src discovery-server/src
RUN mvn -pl discovery-server -am -DskipTests package
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/discovery-server/target/discovery-server-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
