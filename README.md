# Dockerized-Spring-Boot-Mariadb-Application
This project is a full-stack application for managing vehicles. It consists of:

Backend: Spring Boot application (Java) exposing a REST API to manage vehicles.
Frontend: React application to display and interact with vehicle data.
Database: MariaDB storing vehicle information.

It is fully containerized using Docker. You can run it without building anything from source by using the pre-built Docker images.

## **Docker Images**
The following Docker images are included:
| Image                   | Description                                |
| ----------------------- | ------------------------------------------ |
| `springboot-app:latest` | Backend REST API (Spring Boot)             |
| `react-app:latest`      | Frontend React application                 |
| `mariadb:11`            | MariaDB database (optional, preconfigured) |

## 1. Clone the Repository

git clone git@github.com:Laghribi-ghiz/Dockerized-fullstack-Application.git
cd Dockerized-fullstack-Application

## 2. Run the Application with Docker Compose

docker compose up --build

## 5. Access the App

Frontend → http://localhost:3000

Backend API → http://localhost:8000

MariaDB → runs internally on port 3306
