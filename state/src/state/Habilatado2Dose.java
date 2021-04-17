package state;

public class Habilatado2Dose {
	
	private int countDias = 20;
	private boolean tomouDoseUm;

	public void status() {
		
		if (tomouDoseUm == true && countDias == 20) {
			
			System.out.println("Habilato para segunda dose");
		}
		
	}

	

}
