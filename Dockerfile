# syntax=docker/dockerfile:1

FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY target/*.jar jenkins-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/jenkins-demo.jar"]
