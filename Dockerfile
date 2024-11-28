FROM eclipse-temurin:21-jdk-alpine

COPY target/componente-produtos-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/app.jar"]

