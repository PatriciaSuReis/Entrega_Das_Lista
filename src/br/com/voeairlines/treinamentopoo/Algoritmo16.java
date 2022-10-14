package br.com.voeairlines.treinamentopoo;

public class Algoritmo16 {

	/*Entrar com um nome e imprimir 
	*Todo nome 
	*Primeiro caractere 
	*Ultimo caractere 
	*Do primeiro ate o terceiro 
	*Quarto caractere 
	*Todos menos o primeiro 	
	*Os dois últimos 
	*/
	
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String confNome() {
		String todoNome = nome;
		String primeiraLetra = nome.substring(0, 1);
		String ultimaLetra = nome.substring(nome.length() - 1);
		String tresLetra = nome.substring(0, 3);
		String quatroLetra = nome.substring(0, 4);
		String menosOne = nome.substring(1);
		String doisUltima = nome.substring(nome.length() - 2);
		
		return "Nome: " + todoNome
				+ "\nPrimeira letra: " + primeiraLetra 
				+ "\nUltima letra: " + ultimaLetra
				+ "\nAs três primeiras letras: " + tresLetra
				+ "\nAs quatro primeiras letras: " + quatroLetra
				+ "\nNome menos a primeira letra: " + menosOne
				+ "\nAs duas ultimas letras: " + doisUltima;
	}
}
