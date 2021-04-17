package state;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Pessoa {

	

	private String nomeCompleto;
	private String endereco;
	private int numeroSus;
	private String telefone;
	private String profissao;
	private int comorbidades;
	private int idade;
	


	public Pessoa (String nomeCompleto, String endereco, int numeroSus, String telefone,
			String profissao, int comorbidades, int idade) {

		this.nomeCompleto = nomeCompleto;
		this.endereco = endereco;
		this.numeroSus = numeroSus;
		this.telefone = telefone;
		this.comorbidades = comorbidades;
		this.idade = idade;
	}

	public Pessoa() {
		
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumeroSus() {
		return numeroSus;
	}


	public void setNumeroSus(int numeroSus) {
		this.numeroSus = numeroSus;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}



	public int getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(int comorbidades) {
		this.comorbidades = comorbidades;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}



}