# 📘 Spring Boot Student CRUD API

A simple **Spring Boot REST API** project that performs CRUD (Create, Read, Update, Delete) operations on Student data using Spring Data JPA.

---

## Features

* Create a new student
* Fetch all students
* Fetch student by ID
* Update student details
* Delete student by ID
* Uses Spring Boot + Spring Data JPA

---

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Maven
* REST API

---

## 📁 Project Structure

```
src/
 └── main/
     ├── java/com/narendra/restapi/
     │   ├── controller/
     │   │   └── StudentController.java
     │   ├── entity/
     │   │   └── Student.java
     │   ├── repository/
     │   │   └── StudentRepository.java
     │   └── SpringBootRestApiProjectApplication.java
     └── resources/
         └── application.properties
```

---

## 📌 API Endpoints

### 🔹 Get All Students

```
GET /students
```

### 🔹 Get Student by ID

```
GET /students/{id}
```

### 🔹 Create Student

```
POST /students/add
```

#### Sample JSON:

```
{
  "name": "Narendra",
  "percentage": 85.5,
  "branch": "CSE"
}
```

### 🔹 Update Student

```
PUT /students/update/{id}
```

### 🔹 Delete Student

```
DELETE /students/delete/{id}
```

---

## How to Run

1. Clone the repository

```
git clone <your-repo-url>
```

2. Navigate to project folder

```
cd SpringBootRestAPIProject
```

3. Run the application

```
./mvnw spring-boot:run
```

4. Access API at:

```
http://localhost:8080
```

---

## Notes

* Ensure Java and Maven are installed
* Default port: **8080**
* Update `application.properties` for database configuration if needed

---

## Future Improvements

* Add Service Layer
* Add Exception Handling
* Integrate Database (MySQL/PostgreSQL)
* Add Swagger Documentation
* Add Validation

---



## ⭐ If you like this project

Give it a ⭐ on GitHub!
