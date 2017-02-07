<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goodbye</title>
</head>
<body>
	Hello ${candidate.name},
	<br>
	You've been registered for our cource part 2.
	<br><br>
	The Mobyus team.
	<br><br>
	<a href="${pageContext.request.contextPath}/goodbye">Log out</a>
</body>
</html>