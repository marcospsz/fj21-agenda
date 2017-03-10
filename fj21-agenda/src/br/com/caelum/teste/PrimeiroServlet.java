package br.com.caelum.teste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.modelo.Contato;


@WebServlet("/oi")
public class PrimeiroServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		
		Contato contato = new Contato();
		
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<br><b>");
		out.println("Ola Caelum, isso nao pode ser feito desta maneira");
		
		out.println("<br><b>");
		out.println("Ola Caelum, agora eh soh na anotacao");
		
		out.print("</body>");	
		out.println("</html>");		
		
	}

}
