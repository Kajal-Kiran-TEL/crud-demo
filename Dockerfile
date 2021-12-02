FROM maven:3.8.4-jdk-8-alpine

ENV TZ = Asia/Kolkata

COPY . /Users/27697/Documents/cruddemo/


RUN cd /Users/27697/Documents/cruddemo/ \ && mvn clean install -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "/Users/27697/Documents/cruddemo/target/cruddemo-0.0.1-SNAPSHOT.jar", "--spring.config.location=/Users/27697/Documents/cruddemo/src/main/resources/application.properties"]

