## Use OpenJDK 11 slim image
FROM adoptopenjdk:11-jre-openj9-bionic

### Copy JAR file from local machine to container
COPY target/*.jar app.jar

### Expose the port
EXPOSE 8080

HEALTHCHECK --start-period=2m --interval=30s --timeout=5s CMD curl -f http://localhost:8080/api/v1/health/find/status | grep UP || exit 1

### Start the Spring Boot application
CMD ["java","-jar","app.jar"]
