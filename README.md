# LearnHub - Learning Management System

A full-stack LMS built with Spring Boot and React.

🌐 **Live Demo**: [extremecourses.netlify.app](https://extremecourses.netlify.app)

## Features

- JWT authentication with role-based access (ADMIN/STUDENT)
- Course catalog with search and filtering
- Student enrollment system with capacity tracking
- Admin dashboard for course management
- Responsive mobile-first design

## Tech Stack

**Backend**
- Java 21 + Spring Boot 4
- Spring Security + JWT
- Spring Data JPA + Hibernate
- PostgreSQL
- Docker

**Frontend**
- React 19 + Vite
- Tailwind CSS
- Axios
- React Router

## Getting Started

### Backend
```bash
cd backend
# Create application.properties with your DB credentials (see application.properties.example)
mvn spring-boot:run
```

### Frontend
```bash
cd frontend
npm install
# Create .env with VITE_API_URL=http://localhost:8080
npm run dev
```

## Environment Variables

**Backend** (`application.properties`)
```
spring.datasource.url=jdbc:postgresql://localhost:5432/myapp
spring.datasource.username=your_username
spring.datasource.password=your_password
jwt.secret=your_secret_key
```

**Frontend** (`.env`)
```
VITE_API_URL=http://localhost:8080
```
