import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.RequestDumperFilter;

public class OiMvc extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp){
		
		RequestDispatcher rd = req.getRequestDispatcher("ola.jsp");
		
		try {
			rd.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
				
	}
	

}
