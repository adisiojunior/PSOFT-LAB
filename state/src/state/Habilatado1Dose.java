package state;

import java.util.ArrayList;
import java.util.List;

public class Habilatado1Dose {
	
	private int faixaEtaria;
	List<Pessoa> listaPessoas = new ArrayList<>();
	
	public void status() {
		
		if (listaPessoas.getidade() == faixaEtaria || listaPessoas.getProfissao == "saude" || listaPessoas.getComorbidade == 1 ) {

			System.out.println("Habilitado para primeira dose");
		}
		
	}
	
	

}
