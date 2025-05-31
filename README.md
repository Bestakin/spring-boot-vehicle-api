# spring-boot-vehicle-api
# 🚗 Vehicle API System

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
- WebClient (for inter-service calls)
- H2 Database
- Eureka Service Discovery
- Swagger/OpenAPI for API documentation

---

## 🔧 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/vehicle-api-system.git
   cd vehicle-api-system

2. Each service has its own `application.properties` and port.
   Run them separately using IntelliJ or terminal with `mvn spring-boot:run`.

---

## Start the services in this order:

eureka-server → localhost:8761
pricing-service → localhost:8082
maps-service → localhost:9191
vehicles-api → localhost:8080

---

## Access API Docs and Dashboards:
🚘 Swagger UI (Vehicles API): http://localhost:8080/swagger-ui/
🔍 Eureka Dashboard: http://localhost:8761/
