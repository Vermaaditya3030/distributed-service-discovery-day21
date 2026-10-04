# Day 21 Architecture

Client -> API Gateway -> Eureka Service Discovery -> Order/Inventory services.

Eureka keeps a registry of service instances. Gateway uses discovery locator so routes are available as `/order-service/**` and `/inventory-service/**`.

Production upgrades: load balancing, health-aware routing, circuit breakers, centralized config, JWT, OpenTelemetry, retries, Kubernetes, and multiple Eureka nodes.
