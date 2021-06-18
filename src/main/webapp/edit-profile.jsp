
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navigation.jsp" />
<% String username = request.getAttribute("username").toString(); %>
<% String name = request.getAttribute("name").toString(); %>
<% String password = request.getAttribute("password").toString(); %>
<% String age = request.getAttribute("age").toString(); %>
<% String email = request.getAttribute("email").toString(); %>
<% String id = request.getAttribute("id").toString(); %>



<div class="container py-2">
    <div class="row my-2">
        <!-- edit form column -->
        <div class="col-lg-4">
            <h2 class="text-center font-weight-light">Edit Profile page</h2>
        </div>
        <div class="col-lg-8 order-lg-1 personal-info">
            <form role="form" method="POST" action=""users/<%=id%>"">
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">Username</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="text" name="username" value = "<%=username%>" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">Name</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="text" name="name"  value = "<%=name%>"/>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">Password</label>
                                        <div class="col-lg-9">
                        <input class="form-control" type="password" name="password" value = "<%=password%>"/>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">Age</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="text" name="age" value = "<%=age%>" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label">Email</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="email" name="email" value = "<%=email%>" />
                    </div>
                </div>
                                <div class="form-group row">
                                	<button type="submit">Submit</button>
                                </div>
                                
                                <input type="hidden" name="id" value="<%=id%>">
        	</form>
    </div>
</div>
</body>
</html>