  <h1>Weather Application Readme</h1>

  <p>This is a simple weather application that allows users to check the current weather conditions of a city. The application uses the OpenWeatherMap API to fetch weather data based on the user's input.</p>

  <h2>API Key</h2>

  <p>To use this application, you need to obtain an API key from OpenWeatherMap. You can sign up for a free API key on their <a href="https://openweathermap.org/">website</a>.</p>

  <p>Once you have the API key, replace the placeholder value in the <code>apiKey</code> variable at the beginning of the <code>script.js</code> file with your actual API key:</p>

  <pre><code>const apiKey = "your_api_key_here";</code></pre>

  <h2>How to Use</h2>

  <ol>
    <li>Open the <code>index.html</code> file in a web browser.</li>
    <li>Enter the name of the city you want to check the weather for in the search input.</li>
    <li>Click the "Search" button or press Enter.</li>
  </ol>

  <h2>Application Flow</h2>

  <ol>
    <li>The application fetches weather data from the OpenWeatherMap API using the city name and API key.</li>
    <li>If the city is not found (HTTP status 404), an error message is displayed, and the weather information is hidden.</li>
    <li>If the city is found, the weather information is displayed, including the city name, temperature, humidity, and wind speed.</li>
    <li>The weather icon is dynamically updated based on the weather conditions (clouds, clear, rain, drizzle, mist).</li>
  </ol>

  <h2>Project Structure</h2>

  <ul>
    <li><strong>index.html</strong>: The main HTML file that contains the structure of the web page.</li>
    <li><strong>style.css</strong>: The CSS file that styles the HTML elements.</li>
    <li><strong>script.js</strong>: The JavaScript file that contains the application logic, including fetching data from the API and updating the DOM.</li>
  </ul>

  <h2>Weather Icons</h2>

  <p>The application uses weather icons to represent different weather conditions. The icons are located in the "images" folder.</p>

  <ul>
    <li>Clouds</li>
    <li>Clear</li>
    <li>Rain</li>
    <li>Drizzle</li>
    <li>Mist</li>
  </ul>

  <p>Feel free to customize the icons or add more based on your preference.</p>

  <h2>Dependencies</h2>

  <p>This application relies on the Fetch API for making asynchronous requests to the OpenWeatherMap API.</p>

  <h2>Note</h2>

  <p>Ensure a stable internet connection for the application to fetch weather data successfully.</p>

  <p>Feel free to explore and modify the code to suit your needs or add additional features. If you encounter any issues, refer to the OpenWeatherMap API documentation or feel free to reach out for assistance.</p>

