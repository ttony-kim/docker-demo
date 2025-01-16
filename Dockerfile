# Build stage
FROM openjdk:21-slim AS builder
WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test

# TEST
FROM openjdk:21-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]