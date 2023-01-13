FROM openjdk:11.0-jdk

WORKDIR /app

COPY ./target/calculadora-0.0.1-SNAPSHOT.jar .

EXPOSE 8001

ENTRYPOINT ["java","-jar","calculadora-0.0.1-SNAPSHOT.jar"]