package strategy;

public class Carro implements Strategy {

	@Override
	public Double calculateRota(Double kmPecorrido) {
		
		final Double VALOR_KM_CARRO = 1.5;
		
        Double rota_carro = kmPecorrido * VALOR_KM_CARRO;

        return rota_carro;
	}
	

}
