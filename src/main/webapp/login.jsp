<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navigation.jsp" />
            <h3>Login Form</h3>
     <form action="Login" method="Post">
          Username: <input id="username"name="username" placeholder="Your Username" type="text" >
          Password:<input id="password"name="password" placeholder="Your password should be at least 8 characters" type="password" >
          <button name="submit" type="submit">Submit</button>
    </form>


</body>
</html>