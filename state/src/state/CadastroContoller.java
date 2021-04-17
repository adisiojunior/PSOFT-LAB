package state;

import java.util.ArrayList;
import java.util.List;

public class CadastroContoller {
	
	List<Pessoa> listaPessoas = new ArrayList<>();

	public void adicionar(Pessoa cp) {
	    listaPessoas.add(cp);
	}

	public void listaUsuarios() {
		
	    listaPessoas.forEach((p) -> {
	    	
	    	System.out.println("--------------------------------------------------------------");
	        System.out.println("Nome Completo: " + p.getNomeCompleto());
	        System.out.println("Endereço: " + p.getEndereco());
	        System.out.println("Numero do SUS: " + p.getNumeroSus());
	        System.out.println("Telefone: " + p.getTelefone());
	        System.out.println("Comorbidades: " + p.getComorbidades());
	        System.out.println("Ano De Nascimento: " + p.getIdade());
	        System.out.println("-------------------------------------------------------------");
	    
	    });
	}


}
