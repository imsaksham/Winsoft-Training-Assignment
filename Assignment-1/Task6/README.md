<h1>CalculatorController Application</h1>

<h2>Overview</h2>

<p>The CalculatorController application is a Spring MVC (Model-View-Controller) web application implemented in Java. It includes a controller class, `CalculatorController`, that is responsible for handling requests related to a calculator. The controller uses the Spring framework, and it is autowiring a `CalculatorService` for performing calculator operations.</p>

<h2>Prerequisites</h2>

<p>Before running the application, make sure you have the following installed:</p>

<ul>
  <li>Java Development Kit (JDK)</li>
  <li>Apache Maven (for building and managing dependencies)</li>
</ul>
<li>Access the application by navigating to <code>http://localhost:8080/calculate</code> in your web browser (replace 8080 with the port number if different).</li>
</ol>
<h2>Usage</h2>
<ol>
  <li>Open your web browser and navigate to <code>http://localhost:8080/calculate</code>.</li>
  <li>The controller will render the "calculator" view.</li>
  <li>Perform calculator operations using the provided interface.</li>
</ol>
<h2>Controller Endpoint</h2>
<ul>
  <li>Endpoint: <code>/calculate</code></li>
  <li>Method: GET</li>
  <li>Action: Renders the "calculator" view.</li>
</ul>
<h2>Service Integration</h2>
<p>The controller is autowiring a <code>CalculatorService</code> for performing calculator operations. Ensure that the service is properly configured and provides the required functionality.</p>
<h2>Example</h2>
<p>Navigate to <code>http://localhost:8080/calculate</code> in your web browser, and you should see the calculator interface. Use it to perform calculator operations.</p>
