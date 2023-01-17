FROM openjdk:11

ADD target/*.jar jobs.jar

EXPOSE 9004

CMD ["java", "-jar", "jobs.jar"]