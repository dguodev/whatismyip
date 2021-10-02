FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY build/libs/whatismyip*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]