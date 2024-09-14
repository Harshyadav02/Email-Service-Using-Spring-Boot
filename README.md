# Email Sending Service Project

## Overview

This Email Sending Service is a **Spring Boot** project that demonstrates how to send emails using Spring's `JavaMailSender`.
## How It Works

- The service allows you to send emails by calling the `sendMail` method.
- The configuration for the mail server (SMTP host, port, etc.) is handled through the `application.properties` file.
- This project is a great starting point for learning how to integrate email functionality into larger Spring Boot applications.

## Project Structure

Here’s a breakdown of the project structure:

```sh
.
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com
        │       └── email
        │           └── EmailLearnings
        │               ├── EmailLearningsApplication.java
        │               └── Service
        │                   └── EmailService.java
        └── resources
            └── application.properties
```
## Important Files:
**EmailLearningsApplication.java:**  This is the entry point of the Spring Boot application. It triggers the email sending logic at startup.

**EmailService.java:** This service class is responsible for handling the actual email sending functionality using Spring’s JavaMailSender.

**application.properties:** This file contains the configuration for the email service (SMTP settings, port, authentication, etc.).

## How to Run the Project
Prerequisites
Before running this project, ensure that you have the following installed:
``` sh
1. Java 11 or newer
2. Maven
```

### Steps to Run:
1. Clone the repository:

```sh 
git clone https://github.com/Harshyadav02/Email-Service-Using-Spring-Boot 
cd Email-Service-Using-Spring-Boot
```
2. Set up the mail configuration in ``src/main/resources/application.properties``

``` sh 

spring.mail.host=smtp.your-email-provider.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

```
3. Run the project:

Use the Maven wrapper script to build and run the Spring Boot application:
``` 
./mvnw spring-boot:run

```
## Contributing
We welcome contributions! Feel free to fork the repository, make improvements, and submit a pull request. Your input is highly appreciated!

