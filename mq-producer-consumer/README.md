# 🚀 ActiveMQ Producer Consumer using Spring Boot

![Java](https://img.shields.io/badge/Java-Backend-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen)
![ActiveMQ](https://img.shields.io/badge/ActiveMQ-Messaging-blue)
![Producer Consumer](https://img.shields.io/badge/Pattern-Producer%20Consumer-success)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## 📖 Overview

This project demonstrates asynchronous communication between distributed applications using the Producer-Consumer messaging pattern with Spring Boot and ActiveMQ.

The application simulates how enterprise systems publish messages to a queue while independent consumers process them asynchronously.

This architecture enables loose coupling, improved scalability, fault tolerance, and reliable message delivery, making it a common approach in enterprise banking, financial services, logistics, and e-commerce applications.

## 🎯 Problem Statement

In enterprise applications, directly invoking backend services can introduce latency and tightly couple multiple systems together.

To improve scalability and reliability, enterprise systems commonly adopt asynchronous messaging.

This project demonstrates how producers publish messages into an ActiveMQ queue while consumers independently process them without blocking the originating application.

## 🛠 Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java |
| Framework | Spring Boot |
| Messaging Broker | ActiveMQ |
| Build Tool | Maven |
| API Testing | Postman |
| Data Format | JSON |

## 🏗 Project Architecture
```
REST Client
     │
     ▼
Producer API
     │
     ▼
ActiveMQ Queue
     │
     ▼
Consumer
     │
     ▼
Business Processing
     │
     ▼
Application Logs
```

## 🔄 Processing Flow

1. Client sends a request to the Producer API.
2. Producer converts the request into a message.
3. Message is published to the ActiveMQ Queue.
4. Queue stores the message until a consumer is available.
5. Consumer retrieves the message asynchronously.
6. Business logic processes the message.
7. Processing details are logged.

## ✨ Features

- Spring Boot REST API
- ActiveMQ Integration
- Producer Consumer Pattern
- Asynchronous Messaging
- Queue-based Communication
- Loose Coupling
- Reliable Message Delivery
- Message Logging

## 💼 Enterprise Concepts Demonstrated

- Message Queues
- Asynchronous Communication
- Producer Consumer Pattern
- Enterprise Messaging
- Distributed Systems
- Loose Coupling
- Reliable Processing
- Event Driven Architecture

## 📂 Project Structure

```
mq-producer-consumer
│
├── src
│   ├── consumer
|   |   ├── MQConsumer
|   |   ├── MQProducer
|   |   └── MQProducer2
│   └──consumer2
|      ├── MQConsumer2
|      └── MQProducer2  
│── resources
|   └──application.properties
│
├── pom.xml
└── README.md
```

## 📡 REST Endpoint

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/send` | Publishes a message to ActiveMQ |

## 📸 Application Demonstration

### ActiveMQ and Application Console
<img width="1737" height="934" alt="Screenshot 2026-02-16 143208" src="https://github.com/user-attachments/assets/13c4f65e-3233-4ffb-aab2-3358f746cdc3" />

<img width="1729" height="922" alt="Screenshot 2026-02-16 131430" src="https://github.com/user-attachments/assets/974bc01b-c491-4965-a73b-ef9d72f8fa4b" />

<img width="1919" height="968" alt="Screenshot 2026-02-16 131441" src="https://github.com/user-attachments/assets/763f5744-fe8b-4e96-a5d6-061dcc08d66c" />

<img width="1919" height="1015" alt="Screenshot 2026-02-16 131707" src="https://github.com/user-attachments/assets/b7e06665-6b03-4148-9ab6-70883e615658" />

<img width="1919" height="1006" alt="Screenshot 2026-02-16 131746" src="https://github.com/user-attachments/assets/8af474c8-e7a4-4ba4-b132-7b7b15d93b9a" />

<img width="1919" height="1076" alt="Screenshot 2026-02-16 142538" src="https://github.com/user-attachments/assets/36b53a41-8ef3-4a3a-83ae-737dcc52bacf" />

<img width="1914" height="1073" alt="Screenshot 2026-02-16 143131" src="https://github.com/user-attachments/assets/4b3663fd-90e1-40ed-904d-7e41513cb143" />

<img width="1919" height="1079" alt="Screenshot 2026-02-16 143144" src="https://github.com/user-attachments/assets/6bd57226-b9f3-4989-b848-99d290bf3c2e" />

<img width="1919" height="1011" alt="Screenshot 2026-02-23 114112" src="https://github.com/user-attachments/assets/616520a1-d818-4487-ab68-6d71f4490b63" />

<img width="1919" height="1005" alt="Screenshot 2026-02-23 120932" src="https://github.com/user-attachments/assets/c324eb50-da80-4b45-b491-b0b7a2b47462" />

## 🎯 Learning Outcomes

Through this project I gained practical experience in:

- Designing asynchronous messaging systems
- Implementing the Producer Consumer pattern
- Integrating Spring Boot with ActiveMQ
- Building loosely coupled enterprise applications
- Understanding queue-based communication
- Processing messages asynchronously

## 🚀 Future Enhancements

- Dead Letter Queue
- Retry Policies
- Message Persistence
- Kafka Integration
- RabbitMQ Integration
- Docker Support
- Kubernetes Deployment
- Unit Testing

## 👨‍💻 Author

**Geetha Flarance**

Software Engineer | Java Backend & Integration Developer

If you found this project helpful, feel free to connect with me on LinkedIn or explore my other Java backend projects available in this repository.

