package bigExampleLab;


class Compra {
	
	private Anuncio anuncio;
	private int diasAnuncio;
	private double valorTotal;
	
	public Compra(Anuncio anuncio, int diasAnuncio) {
		
		this.anuncio = anuncio;
		this.diasAnuncio = diasAnuncio;
		this.valorTotal = anuncio.getPrecoDoAnuncio(this.diasAnuncio);
	}
	
	public int getDiasAnuncio() {
		
		return diasAnuncio;
	}
	
	public Anuncio getAnuncio() {
		
		return anuncio;
	}
	
	public double getValorTotal() {
		
		return valorTotal;
	}
	
	public int maisPontos() {
		
		return anuncio.maisPontos(diasAnuncio);
	}
	
	public String getDescricaoDoAnuncio() {
		
		return anuncio.getDescricao();
	}
	
	@Override
	public String toString() {
		
		return "\t" + anuncio.getDescricao() + "\t"
				+ String.valueOf(valorTotal) + "\n";
		
	}
}