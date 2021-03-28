package bigExampleLab;

public class Texto extends Anuncio{

	public Texto(String descricao) {
		
		super(descricao);
		precoDoAnuncio = 1.5;
	}
	
	@Override
    public double getPrecoDoAnuncio(int dias){
        
		double resultado = precoDoAnuncio;
        
		if (dias > 3) {
            resultado += (dias - 3) * precoDoAnuncio;
        }
        return resultado;
    }

}
