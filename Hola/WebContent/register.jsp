<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td><label for="name">Name:</label></td>
				<td><input type="text" id="name" name="name" required></td>
			</tr>
			<tr>
				<td><label for="email">Email:</label></td>
				<td><input type="email" id="email" name="email" required></td>
			</tr>
			<tr>
				<td><label for="password">Password:</label></td>
				<td><input type="password" id="password" name="password"
					required></td>
			</tr>
			<tr>
				<td><label for="age">Age:</label></td>
				<td><input type="text" id="age" name="age" required></td>
			</tr>
			<tr>
				<td><label for="gender">Gender:</label></td>
				<td><input type="radio" name="gender" value="male" checked>
					Male<br> <input type="radio" name="gender" value="female">
					Female<br> <input type="radio" name="gender" value="other">
					Other</td>
			</tr>
			<tr>
				<td><label for="city">City:</label></td>
				<td><input type="text" id="city" name="city" required></td>
			</tr>
			<tr>
				<td><label for="movie">Movie:</label></td>
				<td><input type="text" id="movie" name="movie" required></td>
			</tr>
			<tr>
				<td><label for="photo">Photo:</label></td>
				<td><input type="text" id="photo" name="photo" required></td>
			</tr>

		</table>
		<br>
		<button type="submit">Sign Up</button>
	</form>
</body>
</html>
