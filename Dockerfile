FROM maven:3-eclipse-temurin-19
VOLUME /tmp
EXPOSE 8080
ADD target/birth-year-calculator-0.0.1-SNAPSHOT.jar birth-year-calculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/birth-year-calculator-0.0.1-SNAPSHOT.jar"]