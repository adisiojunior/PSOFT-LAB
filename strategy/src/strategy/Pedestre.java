package strategy;

public class Pedestre implements Strategy {

	@Override
	public Double calculateRota(Double kmPecorrido) {

		final Double VALOR_KM_PEDESTRE = 0.1;
				
		Double rota_pedestre = kmPecorrido * VALOR_KM_PEDESTRE;
		
		return rota_pedestre;
	}



}
