# WebServiceTests

This is an example BDD test automation project, written using Cucumber-JVM framework and RestAssured for a google books Web Service. 

# Purpose

This project was developed by me to demonstrate how to use Cucumber-JVM as a BDD test framework.

# Technology Stack 

- Java
- Cucumber
- RestAssured
- JUnit
- Maven

# Prerequisites & Versions

- [Java 11](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html?xd_co_f=9fa7d7ca-2b23-451a-8e37-507cf8bbda6b#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A) - Java Dev Kit
- [Maven 3.6.x](https://maven.apache.org/download.cgi) - Dependency Manager
- [IntelliJ IDEA - IDE](https://www.jetbrains.com/idea/download)
- [Cucumber Plugin](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) - For IntelliJ IDE

# Project Structure

Though the project structure for this sample demo application does not matter much, in large projects it plays an important role from the maintability, accessibility, and reusability standpoint. Therefore, I have devided the overall project code into two main sections; main and test. The main folder contains all the framework related code, whereas test folder contains purely the testcases related stuff - in this case, these are *feture and step definition files*, and *Runner class* which is for the glue code between these two entities. Likewise, you can navigate inside main folder to learn more about project structure. 

# About the Web Service  

I have randonmly found [this](https://www.googleapis.com/books/v1/volumes?q=1) Google Books Web Service link which I'd recommend you to explore further using [Postman](https://www.postman.com/). 

# Execute Tests

This project uses Maven. To run tests, simply run:

```mvn clean test```.

# Test Reports 

You can find the Surefire HTML reports in the following directory of the Project.

\target\surefire-reports\index.html

# Practice Exercises & TODOS

To extend your understanding further with the underline tech-stack, try the following exercises:

Add new scenarios after exploring the response of this Web Service in [Postman](https://www.postman.com). For example, 
- Verify title and author fields for books volume
- Verify the response time should be less than 1s

Add logging in this project using any logging library such as [SLF4J](https://www.slf4j.org/) whose references is also included in the Pom file. 
Explore [Serenity](http://thucydides.info/docs/serenity-staging/) and [Surefire](https://maven.apache.org/surefire/maven-surefire-report-plugin/#:~:text=The%20Surefire%20Report%20Plugin%20has,work%20around%20for%20SUREFIRE%2D257) reporting (References are already included in the pom file). 


