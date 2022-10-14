package br.com.voeairlines.treinamentopoo;

public class Algoritmo17 {

/*Entrar com a base e a altura de um retângulo e imprimir a seguinte saída: 
*Perímetro 
*Area 
*Diagonal 
*/
	
	double alturaRe;
	double baseRe;
	
	public String calculoRetangulo() {
		double perimetroR = 2 * (alturaRe + baseRe);
		double areaR = alturaRe * baseRe;
		double diagonalR = Math.sqrt(Math.pow(alturaRe, 2) + Math.pow(baseRe, 2));
		
		return "Perímetro: " + perimetroR 
				+ ".\nÁrea: " + areaR
				+ ".\nDiagonal: " + diagonalR;
	}
}

