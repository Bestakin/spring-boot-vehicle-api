# 🚗 Spring Boot Vehicle API System

A Spring Boot-based microservices project that simulates a complete vehicle management system with pricing and location data. Built using a modular architecture of 4 services.

---

## 📦 Services

1. **Vehicles API** – Main REST API to create, update, delete, and view vehicle details.
2. **Pricing Service** – Returns pricing information for each vehicle.
3. **Maps Service** – Generates mock location data (address, city, state, zip) based on lat/lon.
4. **Eureka Server** – Service registry for microservice discovery and communication.

---

## 🛠 Technologies Used

- Java 19
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Cloud Eureka
- WebClient (for inter-service communication)
- H2 In-Memory Database
- Swagger/OpenAPI for documentation

---

## 🔧 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/spring-boot-vehicle-api.git
   cd spring-boot-vehicle-api
2. Each service has its own `application.properties` and port.
   Run them separately using IntelliJ or terminal with `mvn spring-boot:run`.

---

## Start the services in this order:

- eureka-server → localhost:8761
- pricing-service → localhost:8082
- maps-service → localhost:9191
- vehicles-api → localhost:8080
