package state;

public class VacinacaoFinalizada {
	
	private boolean habilatoDose2;
	private boolean tomouSegundaDose;
	
	
	public void status () {
		
		if (habilatoDose2 == true && tomouSegundaDose == true) {
			
			System.out.println("Finalizado.");
		}
	}
	

}
