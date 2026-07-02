# 🚀 RESTful Web Service using Spring Boot

![Java](https://img.shields.io/badge/Java-Backend-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen)
![REST API](https://img.shields.io/badge/REST-API-success)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![JSON](https://img.shields.io/badge/JSON-Processing-blue)

## 📖 Overview

This project demonstrates the development of a production-style RESTful web service using Spring Boot.

The application exposes REST endpoints to perform CRUD operations while following a layered architecture consisting of Controller, Service, Repository, and Model layers.

The project focuses on clean API design, request validation, exception handling, and modular backend development practices commonly used in enterprise applications.

## 🎯 Problem Statement

Modern enterprise applications require scalable and maintainable REST APIs to enable communication between frontend applications, mobile applications, and external systems.

This project demonstrates how Spring Boot simplifies REST API development by providing a clean architecture, dependency injection, request mapping, and JSON serialization.

The objective is to build a maintainable backend service following enterprise development practices.

## 🛠 Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java |
| Framework | Spring Boot |
| API Style | REST |
| Build Tool | Maven |
| Data Format | JSON |
| API Testing | Postman |

## 🏗 Project Architecture
```
Client

↓

REST Controller

↓

Service Layer

↓

Repository

↓

Database / In-Memory Data

↓

JSON Response
```
## 🔄 Request Flow

1. Client sends an HTTP request.
2. Spring Boot Controller receives the request.
3. Service layer validates business rules.
4. Repository performs data operations.
5. Response is converted into JSON.
6. Client receives the processed response.

## ✨ Features

- RESTful API Development
- CRUD Operations
- Layered Architecture
- Request Validation
- JSON Serialization
- Exception Handling
- Clean Code Structure

## 💼 Enterprise Concepts Demonstrated

- RESTful Services
- Layered Architecture
- Dependency Injection
- Service-Oriented Design
- Exception Handling
- Request Validation
- JSON Processing

## 📂 Project Structure

```
springboot-rest-api
│
├── src
│   ├── controller
│   ├── model
│── resources
|   └──application.properties
│
├── pom.xml
└── README.md
```

The project follows a modular architecture where each package has a dedicated responsibility, improving maintainability and readability.

## 📡 REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve student by ID |
| POST | `/students` | Create student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student 

## 📸 Application Demonstration

## Postman
<img width="1864" height="968" alt="Screenshot 2026-02-26 112306" src="https://github.com/user-attachments/assets/759c98cd-cd45-4d12-ad30-40951021b518" />

<img width="1858" height="967" alt="Screenshot 2026-02-26 112348" src="https://github.com/user-attachments/assets/3159cc1d-f0f1-4024-86b4-32cce4b7db8a" />

<img width="1873" height="981" alt="Screenshot 2026-02-26 112416" src="https://github.com/user-attachments/assets/6687404a-0003-4782-b627-59f99472b89a" />

<img width="1870" height="971" alt="Screenshot 2026-02-26 112807" src="https://github.com/user-attachments/assets/2cadb67e-e2d2-45f5-8dad-5d7bc6c029c8" />

<img width="1860" height="973" alt="Screenshot 2026-02-26 112900" src="https://github.com/user-attachments/assets/dec8ee74-f7ab-4a2f-9746-cbd1e5c8650d" />

<img width="1875" height="969" alt="Screenshot 2026-02-26 112927" src="https://github.com/user-attachments/assets/54e55d03-6c2f-4500-95ef-d3641bf72fd3" />

<img width="1870" height="977" alt="Screenshot 2026-02-26 112949" src="https://github.com/user-attachments/assets/71b507ec-7d45-48e1-b5b2-a7b4179fa0d5" />

<img width="1870" height="977" alt="Screenshot 2026-02-26 112949" src="https://github.com/user-attachments/assets/88b6deec-545f-4a7c-8d8c-fe0fb9a344de" />

## Application Console

<img width="1919" height="1013" alt="Screenshot 2026-02-26 113329" src="https://github.com/user-attachments/assets/d4696c00-5024-4040-b9ac-a7da023a3ed6" />

## 🎯 Learning Outcomes

This project provided practical experience in:

- Building RESTful web services
- Designing layered Spring Boot applications
- Implementing CRUD operations
- Structuring maintainable backend code
- Developing enterprise-ready APIs
- Handling request validation and exceptions

## 🚀 Future Enhancements

- Spring Data JPA
- MySQL Integration
- JWT Authentication
- Swagger/OpenAPI
- Docker Deployment
- Kubernetes Support
- Unit Testing with JUnit
- CI/CD using GitHub Actions

## 👨‍💻 Author

**Geetha Flarance**

Software Engineer | Java Backend & Integration Developer

If you found this project helpful, feel free to connect with me on LinkedIn or explore my other Java backend projects available in this repository.
