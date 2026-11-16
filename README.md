# Spring Boot Microservices Workspace

A comprehensive, multi-service architecture practice workspace built to explore and implement distributed system concepts. This repository serves as a centralized ecosystem for developing, connecting, and managing independent Spring Boot microservices.

## 🏗️ Architecture Overview

![Microservices Architecture Diagram](assets/architecture.jpg)

This workspace implements a standard microservices pattern using Spring Cloud. Here is how the system operates:

*   **Service Registry (Eureka Server):** Acts as the central directory[cite: 12]. The API Gateway, Student Service, and Department Service all register themselves here upon startup, allowing them to dynamically discover each other's network locations[cite: 12].
*   **API Gateway:** The single entry point for all external client requests (coming from Postman, a Browser, or a React frontend)[cite: 12]. It intercepts the requests and uses load balancing (e.g., `lb://student-service`) to route traffic to the correct microservice instance based on the Eureka registry[cite: 12].
*   **Independent Microservices:** The `Student Service` and `Department Service` handle specific business domains. Following microservice best practices, each service connects to its own isolated database using JPA[cite: 12]. 
*   **Inter-Service Communication:** When microservices need to share data internally (e.g., the Student Service needing Department details), they bypass the API Gateway and communicate directly with each other using a **Feign Client**[cite: 12].

### Current Services
| Service Name | Port | Description | Status |
| :--- | :--- | :--- | :--- |
| **Service Registry** | `8761` | Netflix Eureka Server for service discovery. | 🟢 Active |
| **Department Service** | `TBD` | Manages department entities and database operations. | 🟡 In Progress |
| **Student Service** | `TBD` | Planned service for student management. | ⚪ Planned |
| **API Gateway** | `TBD` | Planned routing and load balancing service. | ⚪ Planned |

## 💻 Tech Stack
* **Core:** Java 21, Spring Boot 3.x
* **Spring Cloud:** Netflix Eureka, API Gateway, OpenFeign
* **Database Management:** JPA / Hibernate (SQL/NoSQL)
* **Build Tool:** Maven

## 🚀 Getting Started
1. Start the **Service Registry** first. Access the Eureka Dashboard at `http://localhost:8761`.
2. Start the individual microservices (e.g., Department Service). Refresh the Eureka dashboard to verify they have registered successfully.

---
*Developed by Abdullah Fahman*