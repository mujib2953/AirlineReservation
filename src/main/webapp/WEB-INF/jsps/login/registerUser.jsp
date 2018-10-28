<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Register User</title>
	</head>
	<body>
		<form action="registetUser" method="POST">
			<pre>
			First Name		: <input type="text" name="firstName" />
			Last Name 		: <input type="text" name="lastName" />
			User Name		: <input type="text" name="email" placeholder="email" />
			Password		: <input type="password" name="password" />
			Confirm Password	: <input type="password" name="confirmPassword" />
			<input type="submit" value="Register User" />
			</pre>
		</form>
	</body>
</html>