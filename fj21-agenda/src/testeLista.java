import java.util.List;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class testeLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ContatoDao dao = new ContatoDao();
	
	List<Contato> contatos = dao.getLista();
	
	for(Contato contato :contatos){
		
		System.out.println(contato.getDataNascimento());
		
	}
	
	
	
	}

}
