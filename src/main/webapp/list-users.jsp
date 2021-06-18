<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
<jsp:include page="navigation.jsp" />
<table>
	<thead>
		<tr>
			<td>Name</td>
			<td>Username</td>
			<td></td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${users}" var="user">
	<tr>
    	<td>${user.getName()}</td>
    	<td>${user.getUsername()}</td>
    	<td><a href="profile/${user.getId()}">Check Profile</a></td>
    </tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>