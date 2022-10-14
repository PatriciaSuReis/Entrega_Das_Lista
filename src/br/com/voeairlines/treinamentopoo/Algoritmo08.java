package br.com.voeairlines.treinamentopoo;

public class Algoritmo08 {
	//Atributos
	private String nomeP;
	private String endereco;
	private int telefone;

	//Construtor
	public Algoritmo08( ){  }
	
	/*public Algoritmo08(String nomeP, String endereco, int telefone){
		this.nomeP = nomeP;
		this.endereco = endereco;
		this.telefone = telefone;
	}*/
	
	//método getters	
	public String getNome() { return this.nomeP; }

	public String getEndereco() { return this.endereco; }
	
	public int getTelefone() { return this.telefone; }

	//método setters
	public void setNome(String nomeP) { this.nomeP = nomeP; }

	public void setEndereco(String endereco) { this.endereco = endereco; }

	public void setTelefone(int telefone) { this.telefone = telefone; }
	
}
