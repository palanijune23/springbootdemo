FROM openjdk:8
ADD target/springbootdemo.jar springbootdemo.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springbootdemo.jar"]
 