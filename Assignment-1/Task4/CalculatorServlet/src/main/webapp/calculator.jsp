<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    body {
        background-color: slategrey;
    }
    h1 {
      color: thistle;
      text-align: center;
      font-size: 44px;
    }
    #calculator {
      width: 270px;
      height: 500px;
      margin: auto;
      box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
      height: 350px;
      margin-top: 60px;
      padding: 40px;
      background-color: rgb(222, 184, 135);
      border-top-left-radius: 20px;
      border-top-right-radius: 20px;
      border-bottom-left-radius: 20px;
      border-bottom-right-radius: 20px;
    }
    #display {
      width: 240px;
      margin: auto;
      height: 60px;
      box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
      border-radius: 7px;
      font-size: 22px;
      font-weight: bold;
      display: grid;
      justify-content: right;
      align-items: center;
      padding: 0px 10px;
      border: none;
      outline: none;
      text-align: right;
      pointer-events: none;
    }
    #keyboard {
      width: 260px;
      margin: auto;
      margin-top: 15px;
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      grid-template-rows: repeat(4, 60px);
      gap: 7px;
    }
    #keyboard > button {
      box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
      font-size: 20px;
      font-weight: bold;
      border-radius: 5px;
      display: grid;
      justify-content: center;
      align-items: center;
    }
    #keyboard > button:hover {
      background-color: teal;
      color: white;
      cursor: pointer;
    }
    .black {
      background-color: black;
      color: white;
    }
    .red {
      background-color: red;
      color: white;
    }
</style>
<body>
    <h1>Calculator</h1>
    <form action="CalculatorServlet" method="get">
	    <div id="calculator">
	      <input id="display" name="operations" value= "<%= (request.getAttribute("operations") != null) ? request.getAttribute("operations") : "" %>" type="text" autofocus="autofocus" />
	      <div id="keyboard">
	      	<button type="submit" name="button" value="1">1</button>
	      	<button type="submit" name="button" value="2">2</button>
	      	<button type="submit" name="button" value="3">3</button>
	      	<button type="submit" name="button" class="black" value="+">+</button>
	      	<button type="submit" name="button" value="4">4</button>
	      	<button type="submit" name="button" value="5">5</button>
	      	<button type="submit" name="button" value="6">6</button>
	      	<button type="submit" name="button" class="black" value="-">-</button>
	      	<button type="submit" name="button" value="7">7</button>
	      	<button type="submit" name="button" value="8">8</button>
	      	<button type="submit" name="button" value="9">9</button>
	      	<button type="submit" name="button" class="black" value="*">*</button>
	      	<button type="submit" name="button" class="red" value="C">C</button>
	      	<button type="submit" name="button" value="0">0</button>
	      	<button type="submit" name="button" class="black" value="=">=</button>
	      	<button type="submit" name="button" class="black" value="/">/</button>
	      </div>
	    </div>
    </form>
    
</body>
</html>