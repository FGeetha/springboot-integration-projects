# 🚀 External REST API Integration using Spring Boot

![Java](https://img.shields.io/badge/Java-Backend-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen)
![REST API](https://img.shields.io/badge/REST-Integration-success)
![JSON](https://img.shields.io/badge/JSON-Processing-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## 📖 Overview

This project demonstrates how enterprise applications communicate with external REST services using Spring Boot.

The application consumes external APIs, processes JSON responses, performs business-level data transformation, and exposes the processed information for downstream applications.

The implementation simulates real-world integration scenarios commonly found in banking, payment gateways, CRM platforms, and third-party enterprise services.

## 🎯 Problem Statement

Enterprise applications rarely operate in isolation.

Most business processes require communication with external systems such as customer information systems, payment gateways, authentication providers, and regulatory services.

This project demonstrates how Spring Boot applications consume external REST APIs, process the responses, handle failures, and integrate external data into enterprise applications.

## 🛠 Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java |
| Framework | Spring Boot |
| Communication | REST API |
| Client | RestTemplate |
| Build Tool | Maven |
| Data Format | JSON |
| API Testing | Postman |

## Project Architecture
```
REST Client
     │
     ▼
Spring Boot Controller
     │
     ▼
Business Service
     │
     ▼
RestTemplate
     │
     ▼
External REST API
     │
     ▼
JSON Response
     │
     ▼
Transformation Layer
     │
     ▼
REST Response
```
## 🔄 Request Flow

1. Client invokes the REST endpoint.
2. Spring Boot Controller receives the request.
3. Service layer validates the input.
4. RestTemplate invokes the external API.
5. JSON response is received.
6. Business logic transforms the response.
7. Processed response is returned to the client.

## ✨ Features

- External REST API Integration
- JSON Processing
- RestTemplate Implementation
- Request Validation
- Response Transformation
- Exception Handling
- Modular Service Design

## 💼 Enterprise Concepts Demonstrated

- External System Integration
- RESTful Communication
- Service Layer Architecture
- API Consumption
- JSON Parsing
- Request Validation
- Exception Handling
- Layered Architecture

## 📂 Project Structure

```
enterprise-integration-system
│
├── src
│   ├── config
│   ├── controller
│   ├── model
│   └── service
│── resources
|   └──application.properties
│
├── pom.xml
└── README.md
```

The project follows a modular architecture where each package has a dedicated responsibility, improving maintainability and readability.
## 📡 REST Endpoint

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/customers` | Retrieves customer information from the external API |
| GET | `/customers/stats` | Retrieves total customers, employed and unemployed customer count from the external API |

## 📸 Application Demonstration

<img width="1919" height="957" alt="Screenshot 2026-03-05 160551" src="https://github.com/user-attachments/assets/aebf0d9f-a61a-4a3c-90d5-7b4d201ee739" />

<img width="1919" height="953" alt="Screenshot 2026-03-05 160604" src="https://github.com/user-attachments/assets/421c4589-b753-4b67-9e6e-3a44ba15531d" />

<img width="1919" height="1079" alt="Screenshot 2026-03-05 160723" src="https://github.com/user-attachments/assets/69c86e5d-1bb9-4ede-8034-c41ab32d4fa9" />

<img width="1916" height="1078" alt="Screenshot 2026-03-05 160743" src="https://github.com/user-attachments/assets/27c66643-674b-4e53-a812-d80873cbd166" />

<img width="1919" height="1076" alt="Screenshot 2026-03-05 160801" src="https://github.com/user-attachments/assets/fcf3e12b-301f-4f3a-9c11-b0f22c371f8a" />

<img width="1917" height="1078" alt="Screenshot 2026-03-05 160817" src="https://github.com/user-attachments/assets/19060cc1-8478-4158-af78-062e2bc3fbd0" />

<img width="1919" height="1079" alt="Screenshot 2026-03-05 160857" src="https://github.com/user-attachments/assets/2739e6d1-1059-48c2-9b44-93bafba0b542" />

## 🎯 Learning Outcomes

This project provided practical experience in:

- Consuming external REST APIs
- Processing JSON responses
- Designing layered Spring Boot applications
- Handling API exceptions gracefully
- Transforming external data into business-friendly responses
- Building enterprise integration services

## 🚀 Future Enhancements

- WebClient Migration
- OAuth2 Authentication
- API Rate Limiting
- Retry Mechanism
- Circuit Breaker using Resilience4j
- API Response Caching
- Docker Deployment
- Kubernetes Support

## 👨‍💻 Author

**Geetha Flarance**

Software Engineer | Java Backend & Integration Developer

If you found this project helpful, feel free to connect with me on LinkedIn or explore my other Java backend projects available in this repository.

