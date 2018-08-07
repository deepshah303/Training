 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<jsp:include page="banner.jsp"/>
	<form action ="User.hola">
		<fieldset style="border: 1px solid">
			<legend>
				<h4>Register to Hola</h4>
			</legend>
			<table>
				<tr>
					<td><label for="name">Name:</label></td>
					<td><input type="text" id="name" name="name" required></td>
				</tr>
				<tr>
					<td><label for="email">Email:</label></td>
					<td><input type="email" id="email" name="email"
						pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$"
						required></td>
				</tr>
				<tr>
					<td><label for="password">Password:</label></td>
					<td><input type="password" id="password" name="password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}" required></td>
				</tr>
				<tr>
					<td><label for="age">Age:</label></td>
					<td>
					<select name ="age" required>
					<% for(int a =18 ; a<=60 ; a++) { %>
					<option value ="<%=a%>"><%=a %></option>
					<%} %>
					</select>
					</td>
				
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
					<td><select name="city" required>
					<% String[] cities = {"Mumbai", "Pune", "Mangalore", "Noida","Kanpur"};
					for(String ct : cities) {%>
					<option value="<%=ct%>"><%=ct%></option>
					<% } %>
					</select></td>
				</tr>
				<tr>
					<td><label for="movie">Movie:</label></td>
					<td><input type="text" id="movie" name="movie" required></td>
				</tr>
				<tr>
					<td><label for="photo">Photo:</label></td>
					<td><input type="file" id="photo" name="photo" required></td>
				</tr>

			</table>
			<br>
			<button type="submit">Sign Up</button>
		</fieldset>
	</form>
<%@include file= "footer.html" %>
</body>
</html>