<h1>Authentication Filter and Logout Servlet</h1>

    <h2>Overview</h2>

    <p>This Java web application includes an authentication filter (`AuthenticationFilter`) and a logout servlet (`Logout`)
        designed to control access to the "/Login" endpoint and handle user logout functionality.</p>

    <h2>Usage</h2>

    <ol>
        <li><strong>Integration:</strong>
            <ul>
                <li>Copy the `AuthenticationFilter` and `Logout` classes into your project.</li>
                <li>Make sure the `login.jsp` page is available in your project.</li>
            </ul>
        </li>
        <li><strong>Configuration:</strong>
            <ul>
                <li>Ensure that the `@WebFilter("/Login")` annotation is present at the beginning of the
                    `AuthenticationFilter` class.</li>
                <li>Ensure that the `@WebServlet("/Logout")` annotation is present at the beginning of the `Logout` class.
                </li>
            </ul>
        </li>
        <li><strong>Dependencies:</strong>
            <ul>
                <li>This filter assumes that it is used in a Java web application with servlets. Ensure that your project
                    includes the necessary servlet dependencies.</li>
            </ul>
        </li>
        <li><strong>Username and Password:</strong>
            <ul>
                <li>Update the `if` condition in the `doFilter` method of `AuthenticationFilter` with the correct
                    username and password that should be accepted for successful authentication.</li>
            </ul>
        </li>
        <li><strong>Session Handling:</strong>
            <ul>
                <li>The filter uses sessions to store the authenticated username. Make sure your web application supports
                    sessions.</li>
            </ul>
        </li>
    </ol>

    <h2>Logout Servlet</h2>

    <p>Additionally, there is a logout servlet (`Logout`) designed to handle user logout functionality. The servlet
        invalidates the user session, removes the "username" attribute, and redirects the user to the "login.jsp" page.
    </p>

