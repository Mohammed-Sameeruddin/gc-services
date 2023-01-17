FROM openjdk:11

ADD target/*.jar routes.jar

EXPOSE 9003

CMD ["java", "-jar", "routes.jar"]