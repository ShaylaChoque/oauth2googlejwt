# oauth2googlejwt 🔐🌐

A Spring Boot REST API that supports Google OAuth2 🔓 and JWT-based authentication 📲. It includes user registration 📝, login ✅, logout 🚪, and user management 👤 features.

## Features

* Google OAuth2 login
* JWT authentication
* Stateless session handling
* RESTful endpoints
* User management (CRUD)
* Swagger/OpenAPI documentation

## Technologies

* Java 17+
* Spring Boot
* Spring Security
* OAuth2 Client
* JWT (JSON Web Token)
* Lombok
* PostgreSQL (or any JPA-compatible DB)
* Swagger (Springdoc OpenAPI)

## Getting Started

### Prerequisites

* Java 17 or newer
* Maven or Gradle
* MySQL (or your preferred DB)

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/oauth2googlejwt.git
   ```

2. Configure your `application.yml` or `application.properties`:

   * Set your Google OAuth client ID and secret.
   * Set your database connection.

3. Build and run the app:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Access Swagger UI at:

   ```
   http://localhost:8080/swagger-ui.html
   ```

## Future Improvements 🚀

* Add role-based access control (RBAC)
* Token revocation or blacklist
* Refresh tokens
* Social login for other providers (GitHub, Facebook, etc.)
