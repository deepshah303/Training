<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="User.hola">
		<table>
			<tr>
				<td><label for="email">Username/Email:</label></td>
				<td><input type="text" id="email" name="email"
					pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$" required></td>
			</tr>
			<tr>
				<td><label for="password">New Password:</label></td>
				<td><input type="password" id="password" name="password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}" required></td>
			</tr>

		</table>
		<button type="submit">Submit</button>
	</form>
</body>
</html>