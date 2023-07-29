FROM amazoncorretto:11-alpine-jdk
MAINTAINER GF
COPY target/argprograma-0.0.1-SNAPSHOT.jar gf-app.jar
ENTRYPOINT ["java","-jar","/gf-app.jar"]
