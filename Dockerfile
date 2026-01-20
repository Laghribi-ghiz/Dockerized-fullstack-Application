# Étape 1 : Image de base avec Java
FROM openjdk:17-alpine

# Étape 2 : Copier le jar depuis target/
ADD target/*.jar app.jar

# Étape 3 : Exposer le port (optionnel mais pratique)
#EXPOSE 8080

# Étape 4 : Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]

