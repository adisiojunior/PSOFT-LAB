package bigExampleLab;

public class Video extends Anuncio {

	public Video(String descricao) {
		
		super(descricao);
		precoDoAnuncio = 3;
		
	}
	
	 @Override
	    public double getPrecoDoAnuncio(int dias) {
		 
	        return dias * precoDoAnuncio;
	    }

	    @Override
	    public int maisPontos(int dias){
	        
	    	if (dias > 1) {
	        
	    		return 1;
	        }
	        
	    	return 0;
	    }

}
