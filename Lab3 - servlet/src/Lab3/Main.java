package Lab3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("<form action='/Lab2/Main' method='post'>\r\n" + 
				"  First name: <input type='v' name='fname'><br>\r\n" + 
				"  Last name: <input type='text' name='lname'><br>\r\n" + 
				"  <input type='submit' value='Submit'>\r\n" + 
				"</form>"+"<span>chuj</span>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tmp = (String) request.getParameter("fname");
		response.getWriter().append("Metoda post\n");
		if(tmp.length()>0)
		{
			response.getWriter().append("Imiê to "+tmp);
		}
	}

}
