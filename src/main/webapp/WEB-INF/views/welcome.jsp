<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	${greeting}
	<br><br>
	<h2>Please register for the next course:</h2><br>
	<form action="register" method="post">
	<label>Name: </label><input type="text" name="name"></input><br><br>
	<label>Email: </label><input type="text" name="email"></input><br><br>
	<input type="submit" value="Register"/>
	</form>
</body>
</html>