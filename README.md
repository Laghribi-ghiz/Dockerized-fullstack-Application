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

## 1. Pull Docker Images

 docker pull ghizlane25/springboot-app:latest

 docker pull ghizlane25/react-app:latest

 docker pull ghizlane25/mariadb:11

## 2. Run MariaDB

docker run -d -p 3306:3306 --name mariadb-test -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=compagnie mariadb:11

## 3. Run Backend

   docker run -d -p 9090:8081 --name springboot-test --link mariadb-test:springdb -e SPRING_DATASOURCE_URL=jdbc:mariadb://springdb:3306/compagnie -e SPRING_DATASOURCE_USERNAME=root -e SPRING_DATASOURCE_PASSWORD=root springboot-app:latest
  
## 4. Run Frontend

   docker run -d -p 3000:8080 --name react-test react-app:latest 

## 5. Access the App

   Frontend: http://localhost:3000
   Backend API: http://localhost:9090/api/voitures
