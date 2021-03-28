package bigExampleLab;


public class Anuncio {
	
	protected String descricao;
	protected double precoDoAnuncio;

	public Anuncio(String descricao) {
		
		this.descricao = descricao;
		this.precoDoAnuncio = 0;
	}
	
	
	public String getDescricao () {

		return descricao;
	}

	public double getPrecoDoAnuncio(int diasAnuncio) {
		
		return 0;
	}

	public int maisPontos(int diasAnuncio) {
		
		return 0;
	}
}