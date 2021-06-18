<ul>
 <%  if (session.getAttribute("user") == null) {   %>
          <li><a href="/exmmIt/Login">Login</a></li>
  			<li><a href="/exmmIt/Registration">Register</a></li>
 <%     } else {
	
  %>
  <li><a href="/exmmIt/Logout">Logout</a></li>
  <li><a href="/exmmIt/UsersListing">Users</a></li>
   <%     } %>
</ul>