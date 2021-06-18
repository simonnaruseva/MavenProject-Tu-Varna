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
<form action="Registration" method="POST" >
            <h3>Registration Form</h3>
         Name: <input id="name" name="first_name" placeholder="Enter your name" type="text"  autofocus></br>
         Username: <input id="username" name="username" placeholder="Enter your Username" type="text" ></br>
		 Password:<input id="password" name="password" placeholder="Your password should be at least 8 characters" type="password" ></br>
		 Confirm Password:<input id="confirm-password" name="confirmPassword" placeholder="Your password should be at least 8 characters" type="password" ></br>
        <input type= "submit" value= "Submit" />
</form>
</body>
</html>