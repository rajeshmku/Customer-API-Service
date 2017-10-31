# Customer-API-Service
Simple service implementation using spring boot


Commands to Run the API:

I. Assume Maven & Java is installed & running: 
  1. Goto the project folder from the terminal 
  2. mvn clean 
  3. mvn clean install 
  4. java -jar target/CustomerAPI-0.0.1-SNAPSHOT.jar
  
II. Assume only Java is installed 
  1. Goto the project folder from the terminal
  2. java -jar target/CustomerAPI-0.0.1-SNAPSHOT.jar


Key Points about API: 
1. The focus was to build a simple API to demonstarte the usage of RAML 
2. The API is build as light weight to support easy extention with mulitple resources 
3. The API is build using Spring boot & Microservices framework that can be deployed independently when needed. 
4. Unit test cases are not covered, since the main focus was on design(RAML) & implement rather than test the APIs
