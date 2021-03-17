<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="UserLogin" method ="post">
			<label for="username">Username</label> <input type="text"
				id="username" name="username" required> <label for="password">Password</label>
			<input type="password" id="password" name="password"
				
				required> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>