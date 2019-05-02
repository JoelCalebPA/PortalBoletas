<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	
	<form role="form" action="<c:url value='/login' />" method='POST'>
		<table>
			<tr>
				<td><label for="username">User</label></td>
				<td><input class="form-control" id="username" name="username" value="" placeholder="Usuario" type="text"></td>
			</tr>
			<tr>
				<td><label for="password">Password</label></td>
				<td><input class="form-control" id="password" name="password" placeholder="password" type="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Login" class="btn btn-primary"/></td>
			</tr>
		</table>
		<c:if test="${not empty error}">
          <div class="alert alert-danger" role="alert">${error}</div>
        </c:if>
	</form>
</body>
</html>