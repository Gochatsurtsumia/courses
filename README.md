# LearnHub 🎓

> ⚠️ **Beta Version** — This project is actively under development and needs significant improvements before production use.

A full-stack Learning Management System built with Spring Boot and React. Students can browse and enroll in courses, while admins can manage the course catalog through a dedicated dashboard.

🌐 **Live Demo**: [extremecourses.netlify.app](https://extremecourses.netlify.app)

> Note: Backend runs on Render free tier — first request may take 50+ seconds to wake up.

## Features

- JWT authentication with role-based access (ADMIN/STUDENT)
- Course catalog with search and filtering
- Student enrollment system with capacity tracking
- Admin dashboard for course management
- Responsive mobile-first design with burger menu

## Known Limitations & Planned Improvements

- [ ] Global exception handler with proper error messages
- [ ] Input validation on all endpoints
- [ ] Unit and integration tests
- [ ] Token refresh mechanism
- [ ] Google/GitHub OAuth login
- [ ] Course progress tracking
- [ ] Video upload support
- [ ] Email notifications on enrollment
- [ ] Pagination for large course lists

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
# Copy and fill in your credentials
cp src/main/resources/application.properties.example src/main/resources/application.properties
mvn spring-boot:run
```

### Frontend
```bash
cd frontend
npm install
# Create .env file
echo "VITE_API_URL=http://localhost:8080" > .env
npm run dev
```

## Environment Variables

**Backend** (`application.properties`)
```
spring.datasource.url=jdbc:postgresql://localhost:5432/myapp
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
jwt.secret=your_secret_key_min_32_chars
```

**Frontend** (`.env`)
```
VITE_API_URL=http://localhost:8080
```

## Deployment

- Backend: [Render](https://render.com) via Docker
- Frontend: [Netlify](https://netlify.com)
- Database: Render PostgreSQL

## License

MIT
