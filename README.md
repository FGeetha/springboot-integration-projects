
# 🚀 Enterprise Integration Projects using Spring Boot, Apache Camel & ActiveMQ

![Java](https://img.shields.io/badge/Java-Backend-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?logo=springboot)
![Apache Camel](https://img.shields.io/badge/Apache%20Camel-Integration-D22128)
![ActiveMQ](https://img.shields.io/badge/ActiveMQ-Messaging-blue)
![REST API](https://img.shields.io/badge/REST-API-success)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)

A curated collection of enterprise-grade Java backend integration projects demonstrating REST APIs, Apache Camel, ActiveMQ messaging, Enterprise Integration Patterns (EIP), and distributed system communication inspired by real-world banking and financial applications.

## 📑 Table of Contents

- 🎯 Project Objective
- 🛠 Technologies Used
- 💡 Skills Demonstrated
- 📂 Repository Modules
- 🏗 Enterprise Integration Architecture
- 🏛 Enterprise Integration Patterns
- ⭐ Why This Repository?
- 🎯 Key Learning Outcomes
- 🚀 Future Enhancements
- 🎯Who is this repository for?
- 🌟Highlights
- 👨‍💻 Author

---

## 🎯 Project Objective

The primary objective of this repository is to demonstrate how enterprise applications communicate using REST APIs, Message Queues, Apache Camel routes, and asynchronous processing.

The repository covers multiple real-world integration patterns and backend services built using Spring Boot, Apache Camel, ActiveMQ, and Java.

The projects focus on writing clean, modular, and maintainable code while implementing enterprise integration concepts used in production systems.

## 🛠 Technologies Used

| Category | Technology |
|----------|------------|
| Language | Java  |
| Framework | Spring Boot |
| Integration | Apache Camel |
| Messaging | ActiveMQ |
| Database | MySQL |
| Build Tool | Maven |
| API Documentation | Swagger/OpenAPI |
| API Testing | Postman |
| Data Formats | JSON, XML |
| Validation | XSD |
  
## 💡 Skills Demonstrated

### Backend Development
- Java
- Spring Boot
- REST APIs

### Enterprise Integration
- Apache Camel
- ActiveMQ
- Enterprise Integration Patterns

### Architecture
- Event-Driven Architecture
- Producer Consumer Pattern
- Asynchronous Messaging

### Data Processing
- JSON
- XML
- XSD Validation

## 📦 Repository Modules

| Module                        | Technologies                 | Purpose                         |
| ----------------------------- | ---------------------------- | ------------------------------- |
| enterprise-integration-system | Spring Boot, Camel, ActiveMQ | Complete enterprise integration |
| camel-rest-to-queue           | Camel, ActiveMQ              | REST → Queue communication      |
| mq-producer-consumer          | ActiveMQ                     | Producer Consumer messaging     |
| iris-api-client               | Spring Boot                  | External REST integration       |
| springboot-rest-api           | Spring Boot                  | REST API fundamentals           |

## 🏗 Enterprise Integration Architecture
```
                 REST Client
                      │
                      ▼
          Spring Boot REST API
                      │
                      ▼
             Apache Camel Route
                      │
          ┌───────────┴───────────┐
          ▼                       ▼
 Content Based Router       Processor
          │                       │
          └───────────┬───────────┘
                      ▼
               ActiveMQ Queue
                      │
                      ▼
                 Consumer
                      │
                      ▼
               Business Logic
                      │
                      ▼
                  Response
```

## 🏛 Enterprise Integration Patterns Implemented

| Pattern | Purpose |
|---------|----------|
| Content Based Router | Routes requests based on business rules |
| Splitter | Splits complex messages into smaller messages |
| Aggregator | Combines multiple messages into a single response |
| Dead Letter Channel | Handles failed messages |
| Idempotent Consumer | Prevents duplicate message processing |
| Message Translator | Converts messages between formats |
| Message Enrichment | Enriches incoming requests |

## ⭐ Why This Repository?

This repository was created to gain hands-on experience with enterprise integration technologies and distributed backend systems.

Rather than building a traditional CRUD application, the focus was on implementing enterprise messaging, asynchronous communication, routing, transformation, and integration patterns commonly used in large-scale banking and financial systems.

## Key Learning Outcomes

- Building scalable Java backend applications

- Developing REST APIs

- Integrating distributed systems

- Implementing Apache Camel routes

- Working with ActiveMQ messaging

- Understanding Enterprise Integration Patterns

- Processing JSON and XML

- Building asynchronous workflows

- Creating reusable backend services

## Future Enhancements

- Docker Support

- Kubernetes Deployment

- GitHub Actions CI/CD

- RabbitMQ Integration

- Kafka Integration

- OAuth2 Security

- JWT Authentication

- Unit Testing using JUnit 5

- Integration Testing

- Centralized Logging

- Spring Cloud Config

- Distributed Tracing

## 🎯 Who is this Repository For?

This repository is intended for:

- Java Backend Developers
- Spring Boot Developers
- Apache Camel Learners
- Integration Developers
- Software Engineering Students
- Developers preparing for enterprise backend interviews

## 🌟 Highlights

- 5 Enterprise Java Projects
- REST API Development
- Apache Camel Integration
- ActiveMQ Messaging
- Enterprise Integration Patterns
- External REST API Consumption
- Production-style Project Documentation

## 👨‍💻 Author

Geetha Flarance

Java Backend & Integration Developer

📧 Email: geethaflarance425@gmail.com

💼 LinkedIn:
https://linkedin.com/in/geetha-flarance-a49a8620a

💻 GitHub:
https://github.com/FGeetha
