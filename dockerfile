FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim
EXPOSE 8080

COPY --from=build /curriculoapi/target/curriculoapi-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]