<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>b{color:green; font-size:20px;}</style>

</head>
<body>
<jsp:include page="navigation.jsp" />
<h1>profile</h1>

<% String username = request.getAttribute("username").toString(); %>
<% String name = request.getAttribute("name").toString(); %>
<% String password = request.getAttribute("password").toString(); %>
<% String age = request.getAttribute("age").toString(); %>
<% String email = request.getAttribute("email").toString(); %>
<% String id = request.getAttribute("id").toString(); %>

<% 
Boolean cookieSet = false;
for(int i = 0; i < request.getCookies().length ; i++) {
	if(request.getCookies()[i].getName().equals("seen_cookie")) {
		cookieSet = true;
	}
}%>

<% if(!cookieSet) { %>
	Welcome! <br>
	<a href="DailyMessage">Stop Welcoming me</a>
<% } %>


      <jsp:useBean id = "students" class = "usr.User"> 
         <jsp:setProperty name = "students" property = "username" value = "<%=username%>"/>
         <jsp:setProperty name = "students" property = "name" value = "<%=name%>"/>
         <jsp:setProperty name = "students" property = "email" value = "<%=email%>"/>
         <jsp:setProperty name = "students" property = "age" value = "<%=age%>"/>
      </jsp:useBean>
      <p>Username 
         <jsp:getProperty name = "students" property = "username"/>
      </p>
      <p>Name
         <jsp:getProperty name = "students" property = "name"/>
      </p>
      <p>Email
         <jsp:getProperty name = "students" property = "email"/>
      </p>
	<p>Age
         <jsp:getProperty name = "students" property = "age"/>
      </p>

	<a href="users/<%=id%>">Edit</a>
</body>
</html>