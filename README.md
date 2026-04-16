# Journal App Backend Service

A robust RESTful backend application built with Spring Boot and MongoDB, designed to securely manage user profiles and journal entries while integrating with external live-data services.

## Key Features
* **RESTful API Architecture:** Engineered a clean and scalable backend service using Java 21 and Spring Boot.
* **Secure Authentication & Authorization:** Implemented Spring Security to protect sensitive endpoints, utilizing Basic Authentication and Role-Based Access Control (RBAC) to restrict administrative routes.
* **Cloud Database Integration:** Managed seamless data persistence with a cloud-hosted MongoDB Atlas database and Spring Data MongoDB.
* **External API Integration:** Integrated the Weatherstack API via Spring's `RestTemplate` to provide live weather updates, applying defensive programming to prevent application crashes on null responses.
* **Testing & Code Quality:** Ensured high application reliability with unit testing using JUnit 5 and Mockito, and enforced secure coding standards using SonarQube.

## Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot (v4.0.2), Spring MVC, Spring Security
* **Database:** MongoDB, MongoDB Atlas, Spring Data MongoDB
* **Build Tool:** Maven
* **Testing:** JUnit 5, Mockito
* **Code Quality & Utilities:** SonarQube, Lombok, Logback (SLF4J)
* **External APIs:** Weatherstack API

## Getting Started

### Prerequisites
Make sure you have the following installed on your machine:
* [Java Development Kit (JDK) 21](https://adoptium.net/)
* [Maven](https://maven.apache.org/)

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/syedrizwan-afk/JournalApp.git](https://github.com/syedrizwan-afk/JournalApp.git)
   cd JournalApp
