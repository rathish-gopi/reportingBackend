FROM openjdk:11
EXPOSE 8080
ADD target/patton-report.jar patton-report.jar
ENTRYPOINT ["java","-jar","/report-patton.jar"]