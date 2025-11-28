# Spring Boot API Automation Framework

A starter API automation framework using **Spring Boot style project structure**, **JUnit 5**, and **Rest Assured**.

> This is focused on testing external APIs (or your microservices), not on building a full Spring Boot app.  
> You can extend it later by adding controllers and a `@SpringBootApplication` main class.

---

## 1. Features

- Gradle-based Java project
- Rest Assured for HTTP API testing
- JUnit 5 test framework
- Externalised configuration via `src/main/resources/application.properties`
- Dockerfile to run tests inside a container

---

## 2. Project Structure

```text
springboot-api-automation-framework/
├── src/
│   ├── main/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/api/
│               └── HealthCheckTest.java
├── build.gradle
├── settings.gradle
├── Dockerfile
└── README.md
```

---

## 3. Configuration

`src/main/resources/application.properties`:

```properties
api.base_url=https://httpbin.org
```

You can change this to point to your microservice or any API under test.

---

## 4. Local Setup & Execution

Ensure you have:

- JDK 17+
- Gradle 8+ (or wrapper if you add it)

Run tests:

```bash
gradle test
```

---

## 5. Docker Usage

Build image:

```bash
docker build -t springboot-api-automation .
```

Run:

```bash
docker run --rm springboot-api-automation
```

The Docker image will run `gradle test` by default.

---

## 6. Jenkins Integration

Typical Jenkins stage:

```groovy
stage('API Tests') {
  steps {
    sh 'gradle test'
    junit 'build/test-results/test/*.xml'
  }
}
```

You can extend tests to cover:

- Authenticated endpoints
- Contract tests
- Integration tests for microservices
