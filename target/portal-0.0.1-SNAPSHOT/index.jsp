<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>This is secured!</h1>
<p>
	Hello <b><c:out value="${pageContext.request.remoteUser}" /></b>
</p>
<c:url var="logoutUrl" value="/logout" />
<form class="form-inline" action="${logoutUrl}" method="post">
	<input type="submit" value="Log out" /> <input type="hidden"
		name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<a href="hello">Click me</a>
</body>
</html>