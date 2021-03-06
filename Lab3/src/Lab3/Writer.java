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

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/writer.jsp");
		
		rd.forward(request, response);
		
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

		String firstName = (String) request.getParameter("fname");
		String lastName = (String) request.getParameter("fname");
		
		RequestDispatcher rd = request.getRequestDispatcher("/writer-out.jsp"); 
		request.setAttribute("fname", firstName);
		request.setAttribute("lname", lastName);
		rd.forward(request, response);
		
		response.setContentType("text/html; charset=UTF-8");	
		response.getWriter().append("Metoda post\n");
		if(firstName.length()>0)
		{	
			response.getWriter().append("<br />Imię to "+firstName);
			response.getWriter().append("<br />Nazwisko to "+request.getParameter("lname"));
			response.getWriter().append("<br /><a href='/lab3'>Powrót do portalu głównego</a>");
		}
	}

}
