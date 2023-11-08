FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install gradle -y
RUN ./gradlew build || return 0

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /bulid/libs/api-multiple-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]