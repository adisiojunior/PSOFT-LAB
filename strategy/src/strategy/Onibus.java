package strategy;

public class Onibus implements Strategy {

	@Override
	public Double calculateRota(Double kmPecorrido) {

		final Double VALOR_KM_ONIBUS = 0.9;
		final Double DESCONTO_FIXO = 0.1;

		Double rota_onibus = kmPecorrido * VALOR_KM_ONIBUS * DESCONTO_FIXO;
		
		return rota_onibus;
	}

}
