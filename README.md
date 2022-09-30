# Calculator Test

Calculator application generated with Java 11, SpringBoot and Maven that publishes a REST API to perform addition and subtraction of two numbers.

## Instructions

- git clone https://github.com/ccastillo2/Calculator.git
- mvn clean (Installs in your maven repository the tracer dependecy)
- mvn package

## How to run

- mvn spring-boot:run

## Endpoints
- *http://localhost:8080/Sum/operator_1/{operator_1}/operator_2/{operator_2}*
- *http://localhost:8080/Subtract/operator_1/{operator_1}/operator_2/{operator_2}*


## API Documentation
Once the application has started, you can consult the API documentation at:

- *http://localhost:8080/swagger-ui/index.html#/*
