package Lab3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BinaryData
 */
@WebServlet("/BinaryData")
public class BinaryData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BinaryData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private byte[] download (String filePath) throws IOException{
		File file = new File (filePath);
		long fileSize = file.length();
		byte[] content = new byte [(int)fileSize];
		FileInputStream FIS = new FileInputStream(file);
		FIS.read(content);
		FIS.close();
		return(content);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		byte [] buffer = download("d://dev/obrazy/broken bag.png");
		response.setContentType("image/png");
    
	    javax.servlet.ServletOutputStream  out = response.getOutputStream();
		response.setContentType("image/jpeg");
		out.write(buffer,0,buffer.length);
		out.close();   
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
