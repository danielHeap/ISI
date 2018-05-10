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
 * Servlet implementation class ImageDownload
 */
@WebServlet("/ImageDownload")
public class ImageDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageDownload() {
        super();
        // TODO Auto-generated constructor stub
    }
    private byte[] download (String filePath) throws IOException{
		File file = new File (filePath);
		long fileSize = file.length();
		byte[] content = new byte [(int)fileSize];
		FileInputStream FIS = new FileInputStream(file);
		FIS.read(content);
		FIS.close();
		return(content);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				byte [] buffer = download("d://dev/obrazy/broken bag.png");
				response.setContentType("image/png");
				response.setContentLength(buffer.length);
				response.addHeader("Content-Disposition", "attachment;filename=obrazek.png");
				OutputStream OS = response.getOutputStream();
				OS.write(buffer);
				OS.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
