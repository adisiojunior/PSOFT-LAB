package strategy;



public class Metro implements Strategy {

	@Override
	public Double calculateRota(Double kmPecorrido) {
		

		final Double VALOR_KM_METRO = 0.9;
		final Double DESCONTO_FIXO = 0.1;
		final double TARIFA_EMBARQUE = 0.2;

		Double rota_metro = kmPecorrido * VALOR_KM_METRO * DESCONTO_FIXO * TARIFA_EMBARQUE;
		
		return rota_metro;
	
	}

}
