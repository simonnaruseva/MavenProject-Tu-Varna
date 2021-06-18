
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import usr.User;

/**
 * Servlet implementation class DailyMessage
 */
public class DailyMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DailyMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie cookie = new Cookie("seen_cookie","yes");
		cookie.setMaxAge(24 * 60 * 60);  // 24 hours. 

		response.addCookie(cookie);
		 HttpSession session=request.getSession();  
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
