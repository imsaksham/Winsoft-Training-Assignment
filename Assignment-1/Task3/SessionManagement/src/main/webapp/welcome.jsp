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

	<h1>Hi! ${username}</h1> <h3>Welcome to my website</h3>
	
	<div>
	
		<h3>To learn about java please <a href="video.jsp">click</a> here</h3>
		
	</div>
	
</body>
</html>