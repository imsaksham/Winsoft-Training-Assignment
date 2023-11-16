# Student Management Application

This is a simple CRUD (Create, Read, Update, Delete) application for managing student details.

## Overview

The application provides basic operations to manipulate student information, including creating, reading, updating, and deleting student records.

## Technologies Used

- Java
- Spring Boot

## Prerequisites

Before running the application, make sure you have the following:

- Java Development Kit (JDK) installed
- An integrated development environment (IDE) like IntelliJ or Eclipse

## API Endpoints

- **Create Student:**
  - Endpoint: `/students`
  - Method: `POST`
  - Request Body: JSON representing student details

- **Get Student by Roll:**
  - Endpoint: `/students/{roll}`
  - Method: `GET`

- **Update Student:**
  - Endpoint: `/students`
  - Method: `PUT`
  - Request Body: JSON representing updated student details

- **Delete Student:**
  - Endpoint: `/students/{roll}`
  - Method: `DELETE`
