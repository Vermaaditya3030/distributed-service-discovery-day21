# Day 21 — Distributed Service Discovery Platform

Java 17 + Spring Boot 3.3.5 + Spring Cloud Netflix Eureka + Spring Cloud Gateway + Docker.

## Run
```bash
docker compose up --build
```

## URLs
- Gateway: http://localhost:8080
- Eureka Dashboard: http://localhost:8761
- Order service: http://localhost:8081
- Inventory service: http://localhost:8082

## Test discovery through Gateway
```bash
curl http://localhost:8080/order-service/api/orders/demo
curl http://localhost:8080/inventory-service/api/inventory/demo
curl http://localhost:8080/order-service/api/orders/ORD-1001
curl http://localhost:8080/inventory-service/api/inventory/LAPTOP-001
```

## Direct health checks
```bash
curl http://localhost:8081/actuator/health
curl http://localhost:8082/actuator/health
```

## GitHub
```bash
git init
git add .
git commit -m "Day 21 distributed service discovery platform"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/distributed-service-discovery-day21.git
git push -u origin main
```

## Learning goals
- Eureka service registry
- Service discovery
- Spring Cloud Gateway discovery routing
- Microservice registration
- Docker networking
- Health checks and Actuator
- Multi-module Maven builds
