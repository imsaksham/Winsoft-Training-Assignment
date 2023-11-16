# Authentication Filter and Logout Servlet

## Overview

This Java web application includes an authentication filter (`AuthenticationFilter`) and a logout servlet (`Logout`) designed to control access to the "/Login" endpoint and handle user logout functionality.

## Usage

1. **Integration:**
    - Copy the `AuthenticationFilter` and `Logout` classes into your project.
    - Make sure the `login.jsp` page is available in your project.

2. **Configuration:**
    - Ensure that the `@WebFilter("/Login")` annotation is present at the beginning of the `AuthenticationFilter` class.
    - Ensure that the `@WebServlet("/Logout")` annotation is present at the beginning of the `Logout` class.

3. **Dependencies:**
    - This filter assumes that it is used in a Java web application with servlets. Ensure that your project includes the necessary servlet dependencies.

4. **Username and Password:**
    - Update the `if` condition in the `doFilter` method of `AuthenticationFilter` with the correct username and password that should be accepted for successful authentication.

5. **Session Handling:**
    - The filter uses sessions to store the authenticated username. Make sure your web application supports sessions.

## Logout Servlet

Additionally, there is a logout servlet (`Logout`) designed to handle user logout functionality
