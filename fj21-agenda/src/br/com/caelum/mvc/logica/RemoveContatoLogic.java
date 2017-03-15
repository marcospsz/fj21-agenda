package br.com.caelum.mvc.logica;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		
		contato.setId(id);
				
		Connection conn = (Connection)req.getAttribute("conn");
		
		ContatoDao dao = new ContatoDao(conn);
		
		dao.exclui(contato);
		
		System.out.println("Excluindo contato...");
				
		return "mvc?logica=ListaContatosLogic";
	}

}



