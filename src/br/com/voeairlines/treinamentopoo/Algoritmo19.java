package br.com.voeairlines.treinamentopoo;

public class Algoritmo19 {
	
	double ladoQuadrado;
	
	public String calculoQuadrado() {
		
		double perimetroQ = 4 * ladoQuadrado;
		double areaQ= Math.pow(ladoQuadrado, 2);
		double diagonalQ = Math.sqrt(2) * ladoQuadrado;
		
		return "Perímetro: " + perimetroQ
				+ "\nArea: " + areaQ
				+ "\nDiagonal: " + diagonalQ;
	}

}
