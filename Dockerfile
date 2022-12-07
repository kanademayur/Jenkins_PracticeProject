FROM openjdk:11
EXPOSE 8080
ADD target/Selenium-Docker.jar Selenium-Docker.jar
ENTRYPOINT ["java","-jar","/Selenium-Docker.jar"]
