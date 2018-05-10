package Lab3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Main
 */
//@WebServlet("/")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Main() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value ="dsadsa";
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp?redirected="+true);
				
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");	
		String tmp = (String) request.getParameter("fname");
		response.getWriter().append("Metoda post\n");
		if(tmp.length()>0)
		{	
			response.getWriter().append("Imię to "+tmp);
			response.getWriter().append("<br><button onclick='window.history.back();'>Go Back</button>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/output.jsp"); 
		request.setAttribute("fname", tmp);
		request.setAttribute("lname", request.getParameter("lname"));
		rd.forward(request, response);
	}

}
