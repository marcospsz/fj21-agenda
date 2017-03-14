package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/adicionaContato")
public class AdicionaServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = resp.getWriter();
		
		//if(req.getParameter("nome")==null){
			//out.println("sem parametros");
			
		//}else{
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataNascimentoTexto = req.getParameter("dataNascimento");
		
		Calendar dataNascimento  = null;
		
		try {
			
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);			
				
			
		} catch (java.text.ParseException e) {
			// TODO: handle exception
			
			out.println("Erro na conversao de data");
			
		}
		
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		RequestDispatcher rd = req.getRequestDispatcher("contato-adicionado.jsp");
		
		rd.forward(req, resp);
				
		//out.println("Contato " + contato.getNome() + " adicionado com sucesso");	
		//}
		
	}	

}
