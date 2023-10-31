<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
	
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	
	<form action="Logout">
		
		<div align="right">
			<input type="submit" value="Logout">
		</div>
		
	</form>

	<div align="center">
		<iframe width="420" height="315"
src="https://www.youtube.com/embed/eIrMbAQSU34">
</iframe>
	</div>
	
</body>
</html>