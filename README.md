# Course-Enrollment-Platform
🚀 Course Enrollment Platform – Full Stack Project

A full-stack Course Enrollment platform built using Spring Boot, Hibernate, MySQL for the back-end and HTML, CSS, JavaScript for the front-end. This project allows students to register, log in, view available courses, enroll in courses, and check enrolled students.

🛠 Tech Stack

Back-end: Spring Boot, Java, Spring MVC, Hibernate (ORM), MySQL

Front-end: HTML, CSS, JavaScript 

API Communication: RESTful API (Fetch API)


✨ Features

✅ Student Registration & Login 
✅ View Available Courses (Fetched from the back-end API)
✅ Enroll in Courses (Many-to-Many relationship stored in MySQL)
✅ View Enrolled Students (Admin can track enrollments)
✅ RESTful API Integration (Front-end connects via fetch requests)

📂 Project Structure

course-registration-system/
│── backend/                # Spring Boot Application
│   ├── src/main/java/com/Courses/  # Java Code
│   ├── src/main/resources/        # Configuration files
│── frontend/               # HTML, CSS, JavaScript
│   ├── index.html          # Login & Registration
│   ├── available.html      # Course List 
│   ├── enrolled.html       # Enrollment
│   ├── script.js           # API Calls & UI Logic

🔗 API Endpoints

⿡ User Registration

POST /api/register

{
  "name": "John Doe",
  "email": "john@example.com",
  "coursename": "Java Essentials"
}

⿢ Login

POST /api/register

⿣ Fetch Courses

GET /api/courses

⿤ Enroll in Course

GET /api/enrolled

💡 Setup & Installation

1. Clone the repository

git clone https://github.com/your-username/course-registration-system.git


2. Backend:

Navigate to the backend/ and run the Spring Boot app:

mvn spring-boot: run

Ensure MySQL is running and update application.properties with DB credentials.


3. Frontend:

Open frontend/index.html in a browser or deploy via a local server.

📌 Contributions are welcome! If you find this useful, feel free to fork and enhance it.



