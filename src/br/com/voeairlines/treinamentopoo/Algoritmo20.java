package br.com.voeairlines.treinamentopoo;

public class Algoritmo20 {

	double paralelepipedo, comprimento, largura, altura;	
	
	public String calculoParalelepipedo() {
		
		double diagonalP = Math.pow(comprimento, 2) * Math.pow(largura, 2) * Math.pow(altura, 2) ;
		
		return "Diagonaldo paralelepípedo: " + diagonalP;
	}
}
