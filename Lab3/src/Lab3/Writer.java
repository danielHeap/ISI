package Lab3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Writer
 */
public class Writer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Writer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");
		String form = "<form action='/lab3/writer' method='post'>"+
			"<div style='width: 5em'>Imię:</div> <input type='text' name='fname'><br>"+
			"<div style='width: 5em'>Nazwisko:</div> <input type='text' name='lname'><br>"+ 
			"<input class='btn btn-primary' type='submit' value='Wyślij'>"+
			"</form>";
		response.getWriter().append(form);

		response.getWriter().append("<br /><a href='/lab3'>Powrót do portalu głównego</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");	
		String tmp = (String) request.getParameter("fname");
		response.getWriter().append("Metoda post\n");
		if(tmp.length()>0)
		{	
			response.getWriter().append("<br />Imię to "+tmp);
			response.getWriter().append("<br />Nazwisko to "+request.getParameter("lname"));
			response.getWriter().append("<br /><a href='/lab3'>Powrót do portalu głównego</a>");
		}
	}

}
