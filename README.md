# Calculator

Calculator that allows you to do addition and subtraction

---
## Requirements

For building and running the application you need:

- [JDK 11]
- [Maven 3](https://maven.apache.org)


---
## Compilation and execution procedures
To build and run the project, follow these steps:

1. Make sure you have Maven installed on your system.
2. Download the project code to your machine.
```shell
https://github.com/carlos1811/calculator.git
```
3. Access the root folder of the project from the command line.
4. Run the following command to build the project:
```shell
mvn clean install
```
5. After the build is complete, run the following command to start the service:
```shell
mvn spring-boot:run
```
---

## Examples of API calls

```shell
curl -X 'GET' \
  'http://localhost:8080/api/add?inputA=34&inputB=3&result=0' \
  -H 'accept: */*'
```
