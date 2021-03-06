<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<h1>Core Tags Demo</h1>

	<c:set var="msg" value="Hello JSTL" />
	<h3>
		<c:out value="${msg}" />
	</h3>
	<c:forEach var="count" begin="1" end="10" step="1">
		<c:if test="${count%2 == 0}">
			<h4>${count}</h4>
		</c:if>
	</c:forEach>

	<c:set var="week" value="Sun-Mon-Tue-Wed-Thu-Fri-Sat" />
	<c:forTokens items="${week}" delims="-" var="day">
		<H4>${day}</H4>
	</c:forTokens>
</body>
</html>