<h1>Student Management Application</h1>

<p>This is a simple CRUD (Create, Read, Update, Delete) application for managing student details.</p>

<h2>Overview</h2>

<p>The application provides basic operations to manipulate student information, including creating, reading, updating, and deleting student records.</p>

<h2>Technologies Used</h2>

<ul>
    <li>Java</li>
    <li>Spring Boot</li>
</ul>

<h2>Prerequisites</h2>

<p>Before running the application, make sure you have the following:</p>

<ul>
    <li>Java Development Kit (JDK) installed</li>
    <li>An integrated development environment (IDE) like IntelliJ or Eclipse</li>
</ul>

<h2>API Endpoints</h2>

<ul>
    <li><strong>Create Student:</strong></li>
    <ul>
        <li>Endpoint: <code>/students</code></li>
        <li>Method: <code>POST</code></li>
        <li>Request Body: JSON representing student details</li>
    </ul>

    <li><strong>Get Student by Roll:</strong></li>
    <ul>
        <li>Endpoint: <code>/students/{roll}</code></li>
        <li>Method: <code>GET</code></li>
    </ul>

    <li><strong>Update Student:</strong></li>
    <ul>
        <li>Endpoint: <code>/students</code></li>
        <li>Method: <code>PUT</code></li>
        <li>Request Body: JSON representing updated student details</li>
    </ul>

    <li><strong>Delete Student:</strong></li>
    <ul>
        <li>Endpoint: <code>/students/{roll}</code></li>
        <li>Method: <code>DELETE</code></li>
    </ul>
</ul>
