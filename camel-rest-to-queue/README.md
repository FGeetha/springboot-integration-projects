
# 🚀 REST to Queue Integration using Apache Camel & ActiveMQ

![Java](https://img.shields.io/badge/Java-Backend-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?logo=springboot)
![Apache Camel](https://img.shields.io/badge/Apache%20Camel-EIP-D22128)
![ActiveMQ](https://img.shields.io/badge/ActiveMQ-Messaging-005571)
![REST API](https://img.shields.io/badge/REST-API-009688)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)

A Spring Boot application demonstrating enterprise-grade REST-to-Queue communication using Apache Camel and ActiveMQ.

This project showcases how synchronous REST requests can be transformed into asynchronous message processing using message queues, enabling loose coupling, scalability, and reliable communication between distributed systems.

The implementation simulates enterprise integration scenarios commonly found in banking, payment processing, insurance, and financial services applications.

## 📖 Problem Statement

Enterprise systems frequently receive thousands of requests every second.

Direct synchronous communication between systems increases response time and introduces tight coupling.

This project demonstrates how Apache Camel and ActiveMQ can be used to decouple producers and consumers by converting REST requests into asynchronous queue messages.

The approach improves scalability, fault tolerance, and reliability while ensuring that backend services continue processing messages independently.

## 🛠 Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java |
| Framework | Spring Boot |
| Integration Framework | Apache Camel |
| Messaging | ActiveMQ |
| Build Tool | Maven |
| API Testing | Postman |
| Data Format | JSON |

## 🏗 Project Architecture

```
REST Client

↓

Spring Boot Controller

↓

Apache Camel Route

↓

Message Validation

↓

ActiveMQ Queue

↓

Queue Consumer

↓

Business Processing
```

## 🔄 Request Flow

1. Client sends a REST request.
2. Spring Boot Controller receives the request.
3. Apache Camel validates the payload.
4. Camel transforms the request into a queue message.
5. The message is published to ActiveMQ.
6. Consumer retrieves the message.
7. Business logic processes the request.
8. Processing status is logged.

## 💼 Enterprise Concepts Demonstrated

- REST to Queue Communication
- Asynchronous Messaging
- Message Routing
- Apache Camel Routing
- Producer Consumer Pattern
- Loose Coupling
- Enterprise Messaging
- ActiveMQ Integration
- Distributed System Communication

## 📡 REST Endpoint

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/send` | Sends a message from REST API to ActiveMQ Queue |

## 📂 Project Structure

```
camel-rest-to-queue
│
├── src
│   ├── processor
│   └── routes
├── resources
|   └── application.properties
│
├── pom.xml
└── README.md
```

The project follows a modular architecture where each package has a dedicated responsibility, improving maintainability and readability.

## 📸 Application Demonstration

<img width="1919" height="1077" alt="image" src="https://github.com/user-attachments/assets/81df79cf-0d8f-466d-8338-80b1eb824578" />
<img width="1919" height="1007" alt="image" src="https://github.com/user-attachments/assets/89ccec7f-c448-49b5-a72c-e744a1c1ec34" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0be663bd-8381-4048-86b0-d1e0c94ada55" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/b5b783ae-f05d-4e5e-9330-44e89cd1a8f6" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/a281bdfe-cdff-447c-a834-60191e83f535" />
<img width="1919" height="680" alt="image" src="https://github.com/user-attachments/assets/d638cc89-fed4-42d0-beb3-1bd52bf76a06" />
<img width="1919" height="1076" alt="image" src="https://github.com/user-attachments/assets/cd7102fc-c204-405f-8e1a-f8e7706305ce" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/52bf0d78-855a-4545-96d1-dfcbd4a66e4e" />

## 🎯 Learning Outcomes

This project provided practical experience in:

- Designing asynchronous communication workflows
- Integrating REST APIs with ActiveMQ
- Building Apache Camel routes
- Message routing and transformation
- Enterprise messaging concepts
- Distributed application design

## 🚀 Future Enhancements

- Message Persistence
- Retry Mechanism
- Dead Letter Queue
- Kafka Integration
- RabbitMQ Support
- Docker Deployment
- Kubernetes Deployment
- JWT Authentication

## 👨‍💻 Author

**Geetha Flarance**

Software Engineer | Java Backend & Integration Developer

If you found this project helpful, feel free to connect with me on LinkedIn or explore my other Java backend projects available in this repository.
