package br.com.voeairlines.treinamentopoo;

public class Algoritmo18{
	
	double raio;
	
	public String calculoRaio() {
		
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		
		return "Perímetro do círculo: " + perimetro
				+ "\nArea do círculo: " + area;
	}
}
