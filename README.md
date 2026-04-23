# Student Management System

A full-stack web application to manage student records built with Java Spring Boot and React.js.

## Tech Stack
- **Backend:** Java, Spring Boot, Hibernate/JPA, REST API, Maven
- **Frontend:** React.js
- **Database:** MySQL
- **Testing:** Postman

## Features
- Add new students
- View all students
- Edit existing student details
- Delete students
- Full CRUD operations via REST API

## Project Structure
- `student-management-system` — Spring Boot backend
- `student-management-frontend` — React.js frontend

## How to Run

### Backend
```bash
cd student-management-system
mvn spring-boot:run
```
Backend runs on http://localhost:8080

### Frontend
```bash
cd student-management-frontend
npm install
npm start
```
Frontend runs on http://localhost:3000

## API Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| GET | /students | Get all students |
| POST | /students | Add new student |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |
