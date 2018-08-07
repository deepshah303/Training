<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>

	<form action = "User.hola">
		<fieldset style="border: 1px solid">
			<legend>
				<h4>Sign In</h4>
			</legend>
			<table>
				<tr>
					<td><label for="email">Username/Email:</label></td>
					<td><input type="text" id="email" name="email"
						pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$"
						required></td>
				</tr>
				<tr>
					<td><label for="password">Password:</label></td>
					<td><input type="password" id="password" name="password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}" required></td>
				</tr>
			</table>
			<div id="lower">
				<br> <a href="forget.jsp">Forget password?</a> <br> <br>
				<input type="submit" value="Login">
			</div>
			<br> <a href="register.jsp">New user?Register</a>
			<!--/ lower-->
		</fieldset>
	</form>
</body>
</html>