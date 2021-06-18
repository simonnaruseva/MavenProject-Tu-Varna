
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import usr.User;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private String docType;
	    private String title;
	    private String format;
	    
	    
		 public void init() throws ServletException{
		        docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		        title = "Using POST Method to Read Form Data";
		        format = "%s <html>\n<head><title>%s</title></head>\n<body >\n<h1 align=\"center\">%s</h1>\n<ul>\n<li><b>First Name</b>:%s\n<li><b>Last Name</b>:%s\n</ul>\n</body></html>";	    }
		
		 
		 
		 

		 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	        HttpSession session=request.getSession();  
 	        
 	        
 	        if(null == session.getAttribute("user")) {
 			 	RequestDispatcher bb = request.getRequestDispatcher("login.jsp");
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
			response.setContentType("text/html");

	        String fName = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        if(fName.isEmpty() || password.isEmpty())
			{
				RequestDispatcher req = request.getRequestDispatcher("nevalidni-danni.jsp");
				req.include(request, response);
			}
	        
			 else 
			{				
				 for (User user: Registration.users) {
			        	if(user.getUsername().equals(fName) &&  user.getPassword().equals(password) ) {
			    	        HttpSession session=request.getSession();  
			    	        session.setAttribute("user",user); 
			    	        session.setAttribute("user_id", Integer.toString(user.getId())); 
			    	        
			    	        User userFromSession = (User) session.getAttribute("user");
			        		
			        		
			        		
			    			request.setAttribute("username", userFromSession.getUsername());
			    			request.setAttribute("name", userFromSession.getName());
			    			request.setAttribute("password", userFromSession.getPassword());
			    			request.setAttribute("age", userFromSession.getAge());
			    			request.setAttribute("email", userFromSession.getEmail());
			    			request.setAttribute("id", userFromSession.getId());
			    			
			    			
							RequestDispatcher ss = request.getRequestDispatcher("uspeshno-vlizane.jsp");
							ss.forward(request, response);
							return;
			        	}
			        	
				 }
				 RequestDispatcher bb = request.getRequestDispatcher("invalid-credentials.jsp");
					bb.forward(request, response);
				
			
			}
		}
		 

}
