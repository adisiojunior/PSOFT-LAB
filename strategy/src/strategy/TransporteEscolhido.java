package strategy;

public class TransporteEscolhido {

	private Double kmPercorrido;
	private Double calculaRotas;
	private Strategy tipoDeTransporte;
	
	
	public TransporteEscolhido (Strategy tipoDeTransporte) {
		
		this.tipoDeTransporte = tipoDeTransporte;
	}
	
	public void calculateRota() {
        calculaRotas = tipoDeTransporte.calculateRota(kmPercorrido);
    }

}
