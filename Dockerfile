FROM openjdk:11
EXPOSE 8080
ADD target/Practise-Docker.jar Practise-Docker.jar
ENTRYPOINT ["java","-jar","/Practise-Docker.jar"]