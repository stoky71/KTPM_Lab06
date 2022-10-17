FROM maven:latest

WORKDIR /lab05-jpa-api
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run