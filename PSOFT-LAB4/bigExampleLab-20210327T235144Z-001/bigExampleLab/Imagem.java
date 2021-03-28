package bigExampleLab;

public class Imagem extends Anuncio {

	public Imagem(String descricao) {
		
		super(descricao);
		precoDoAnuncio = 2;
		
	}

	@Override
    public double getPrecoDoAnuncio(int dias) {
		
        double resultado = precoDoAnuncio;
        
        if (dias <= 2){
        
        	resultado += (3*dias);
        }
        return resultado;
    }
}
