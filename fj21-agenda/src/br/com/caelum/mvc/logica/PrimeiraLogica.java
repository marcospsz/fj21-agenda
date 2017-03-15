package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		System.out.println("Executandoa logica...");
		
		System.out.println("Rertornando o nome da pagina jsp");		
		return "primeira-logica.jsp";
		
	}	

}
