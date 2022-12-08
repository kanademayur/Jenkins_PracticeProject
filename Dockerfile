FROM openjdk:11
EXPOSE 8081
ADD target/SpringBoot-1.war SpringBoot-1.jar
ENTRYPOINT ["java","-jar","/SpringBoot-1.jar"]
