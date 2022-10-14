package br.com.voeairlines.treinamentopoo;

public class Algoritmo07 {
	
	int numeroX = 0;
	
	public int antecessorNumero(int antecessor){
		antecessor = numeroX - 1;
		return antecessor;
	}
	public int sucessorNumero(int sucessor) {
		sucessor = numeroX + 1;
		return sucessor;
	}
}
