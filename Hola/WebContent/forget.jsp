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
				<td><label for="email">Email:</label></td>
				<td><input type="email" id="email" name="email"
					pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$" required></td>
			</tr>

			<tr>
				<td><label for="movie">Enter your favorite Movie:</label></td>
				<td><input type="text" id="movie" name="movie" required></td>
			</tr>

		</table>
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>