# Завантажуємо образ OpenJDK 17 з slim-образом Debian як базовий
FROM openjdk:17-slim

# Set the working directory
WORKDIR /app

# Copy the pom.xml file into the image
COPY pom.xml .
COPY src /app/src

# Package the application without running tests
RUN apt-get update && apt-get install -y maven && mvn package -DskipTests

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/HW20_Docker-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]