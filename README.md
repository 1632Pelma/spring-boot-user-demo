# Spring Boot User Management Demo

## Overview

A simple Spring Boot project demonstrating basic architecture, annotations, and dependency injection.

## Technologies

- Java 17
- Spring Boot 3.1.0
- JUnit 5
- Mockito (for testing)

## How to Run

1. Clone the repo
2. Run `./gradlew bootRun`
3. Console will print the user interactions

## How to Test

Run: `./gradlew test`

## Project Structure

- Model: `User.java`
- Repository: In-memory `FakeRepo`
- Service: `UserServiceImpl`
- Test: `UserServiceTests.java`

## Features

- Layered architecture (Model, Repository, Service)
- Dependency Injection
- In-memory data storage
- Unit testing with Mockito
