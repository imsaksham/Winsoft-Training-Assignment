<h1>Servlet Demo Application</h1>

<p>This is a simple Java Servlet application that responds to HTTP GET requests by printing "Hello World" to the response. The servlet is mapped to the URL pattern "/Demo."</p>

<h2>Servlet Description</h2>

<ul>
    <li><strong>Servlet Class:</strong> <code>Demo.java</code></li>
    <li><strong>URL Mapping:</strong> <code>/Demo</code></li>
    <li><strong>HTTP Method:</strong> GET</li>
</ul>

<h2>How to Run</h2>

<ol>
    <li><strong>Compile Servlet:</strong><br>
        Compile the <code>Demo.java</code> servlet using a Java compiler. Ensure that you have the necessary servlet container (e.g., Apache Tomcat) set up.<br>
        <code>javac Demo.java</code></li>
    <li><strong>Deploy to Servlet Container:</strong><br>
        Deploy the compiled servlet (<code>.class</code> file) to your servlet container. If using Apache Tomcat, copy the compiled <code>Demo.class</code> file to the <code>WEB-INF/classes</code> directory of your Tomcat web application.</li>
    <li><strong>Start Servlet Container:</strong><br>
        Start your servlet container.</li>
    <li><strong>Access the Servlet:</strong><br>
        Open a web browser and navigate to <code>http://localhost:8080/your-web-app-context/Demo</code> (replace <code>your-web-app-context</code> with the actual context path of your web application). You should see "Hello World" displayed on the page.</li>
</ol>
