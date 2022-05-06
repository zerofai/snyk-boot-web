FROM --platform=linux/amd64 openjdk:11.0.13-slim-buster
ARG JAR_FILE=target/snyk-boot-web-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]