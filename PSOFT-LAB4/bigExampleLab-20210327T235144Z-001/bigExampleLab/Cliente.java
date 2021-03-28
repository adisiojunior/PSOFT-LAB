package bigExampleLab;

import java.util.Enumeration;
import java.util.Vector;


class Cliente {

	private String nome;
	private Vector compras = new Vector();
	private double valorTotal;
	private int pontosFRequentes;

	public Cliente(String nome) {
		this.nome = nome;
	}

	///--------------------------------------------------
	/// ------------ Adicionar Compra  ------------------
	/// -------------------------------------------------
	public void addCompra(Compra arg) {

		compras.addElement(arg);
		valorTotal += arg.getValorTotal();
		pontosFRequentes++;
		pontosFRequentes += arg.maisPontos();
	}

	///--------------------------------------------------
	/// ------------ Retorna Nome do Cliente  -----------
	/// -------------------------------------------------
	public String getNome() {
		return nome;
	}

	///--------------------------------------------------
	/// ----------------   Histórico  -------------------
	/// -------------------------------------------------
	public String historico() {

		String resultado = "Historico de compras de anuncios por " + getNome() + "\n"
				+ detalharCompra()
				+ "Total devido é " + String.valueOf(valorTotal) + "\n"
				+ "Voce ganhou " + String.valueOf(pontosFRequentes) + " pontos";
		return resultado;
	}

	///--------------------------------------------------
	/// --------------   Detalhar Compra  ---------------
	/// -------------------------------------------------
	private String detalharCompra() {
		
		String resultado = "";
		
		Enumeration comprasAnuncio = compras.elements();
		
		while (comprasAnuncio.hasMoreElements()) {
		
			Compra compra = (Compra) comprasAnuncio.nextElement();
			resultado += compra.toString();
		}
		
		return resultado;
	}

}