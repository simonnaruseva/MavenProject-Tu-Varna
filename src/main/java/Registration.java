import java.io.IOException;
import java.util.*; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import usr.User;

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<User> users;
	
	
    public void init() throws ServletException{
    	users =  new ArrayList<User>();
    }
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session=request.getSession();  
	        
	        
	        if(null == session.getAttribute("user")) {
			 	RequestDispatcher bb = request.getRequestDispatcher("registration.jsp");
			 	bb.forward(request, response);
	        }
	        else {
 	        User userFromSession = (User) session.getAttribute("user");
	        
 			request.setAttribute("username", userFromSession.getUsername());
 			request.setAttribute("name", userFromSession.getName());
 			request.setAttribute("password", userFromSession.getPassword());
 			request.setAttribute("age", userFromSession.getAge());
 			request.setAttribute("email", userFromSession.getEmail());
 			request.setAttribute("id", userFromSession.getId());
 	        
 	        
			 	RequestDispatcher bb = request.getRequestDispatcher("uspeshno-vlizane.jsp");
			 	bb.forward(request, response);
			 
	        }
			
		 }
    
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		
		if(first_name.isEmpty() ||  username.isEmpty()   ||  password.isEmpty()   ||  confirmPassword.isEmpty() || !password.equals(confirmPassword))
		{
			RequestDispatcher req = request.getRequestDispatcher("nevalidni-danni.jsp");
			req.include(request, response);
		}
		else 
			users.add(new User(username, first_name, password, this.users.size() + 1));
			response.sendRedirect("login.jsp"); 
		}
	}
