FROM openjdk:11
EXPOSE 8082
ADD target/SpringBoot-2.jar SpringBoot-2.jar
ENTRYPOINT ["java","-jar","/SpringBoot-2.jar"]
