package br.com.voeairlines.treinamentopoo;

public class Algoritmo22 {

	double diagonalMaior;
	double diagonalMenor;
	double areaT;
	
	public String areaLosango() {
	
		if (diagonalMaior != diagonalMenor) {
			areaT = (diagonalMaior * diagonalMenor) / 2;
		} else {
			System.out.println("Os números não pode ser iguais!");
		}
		
		return "Area triângulo: " + areaT;
	}

}
