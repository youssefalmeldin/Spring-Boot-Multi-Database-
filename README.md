# Spring-Boot-Multi-Database-

# 🧩 Spring Boot Multi-Database (MySQL + PostgreSQL)

This project demonstrates how to connect a **Spring Boot** application to **two separate databases** using custom configurations and multiple data sources:

✅ **MySQL** for `User` data  
✅ **PostgreSQL** for `Product` data  

Ideal for modular systems, microservices, or legacy integrations requiring separate databases.

---

## 🛠️ Tech Stack

- ☕ Java 21  
- 🚀 Spring Boot 3.5.3  
- 🧬 Spring Data JPA  
- 🐬 MySQL 8+  
- 🐘 PostgreSQL (Docker)  
- 📦 Maven  
- ✨ Lombok  

---

## 📁 Project Structure

multi-database-springboot/
├── config/
│ ├── MySQLConfig.java # MySQL configuration (User DB)
│ └── PostgresConfig.java # PostgreSQL configuration (Product DB)
│
------------------------------------
├── model/
│ ├── mysql/
│ │ └── User.java # User entity
│ └── postgres/
│ └── Product.java # Product entity
│
---------------------------------------
├── repository/
│ ├── mysql/
│ │ └── UserRepository.java # JPA repository for users
│ └── postgres/
│ └── ProductRepository.java# JPA repository for products
│
------------------------------------

├── controller/
│ ├── UserController.java # REST controller for users
│ └── ProductController.java # REST controller for products
│
------------------------------------

├── resources/
│ └── application.properties # DB & JPA configuration
│
------------------------------------

└── MultiDatabaseApplication.java # Main Spring Boot class 



---

## 📌 Key Features

- 🔗 Separate configuration per database (MySQL & PostgreSQL)
- 🛠️ Dedicated `DataSource`, `EntityManagerFactory`, and `TransactionManager` for each
- 🔍 SQL logging and auto schema update enabled
- 🐘 PostgreSQL runs easily via Docker
- 🐬 MySQL is used locally for development

---

## 🚀 How to Run

### Step 1: Start PostgreSQL using Docker
```bash
docker run --name productdbt -e POSTGRES_PASSWORD=your_postgres_password -p 5432:5432 -d postgres
