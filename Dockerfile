FROM openjdk:8
EXPOSE 9090
ADD target/springbootdemo.jar springbootdemo.jar
ENTRYPOINT ["java", "-jar", "/springbootdemo.jar"]
 