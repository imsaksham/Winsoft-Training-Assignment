# Spring Boot Application

This is a simple Spring Boot application for managing series and matches.

## Overview

The application provides RESTful APIs to perform CRUD operations on series and matches. It is designed to store information about sports series, matches, and their details.

## Technologies Used

- Spring Boot
- Java
- Oracle Database

## Prerequisites

Before running the application, make sure you have the following installed:

- Java SDK
- Maven
- Oracle Database

## Project Structure

Describe the project structure here.

## Database Setup:**
   - Create a new schema in your Oracle Database.
   - Configure the database connection properties in `src/main/resources/application.properties`.


## Running the Application

Explain how to run the Spring Boot application and any additional details.

## API Endpoints

- **Create Series:**
  - Endpoint: `/api/series`
  - Method: `POST`
  - Request Body: JSON representing the new series.

- **Get All Series:**
  - Endpoint: `/api/series`
  - Method: `GET`

- **Get Series by ID:**
  - Endpoint: `/api/series/{seriesId}`
  - Method: `GET`

- **Update Series:**
  - Endpoint: `/api/series/{seriesId}`
  - Method: `PUT`
  - Request Body: JSON representing the updated series.

- **Delete Series:**
  - Endpoint: `/api/series/{seriesId}`
  - Method: `DELETE`
