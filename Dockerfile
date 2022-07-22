FROM openjdk:8
EXPOSE 8080
ADD target/springboot-customer-app.jar springboot-customer-app.jar
ENTRYPOINT ["java","-jar","/springboot-customer-app.jar"]