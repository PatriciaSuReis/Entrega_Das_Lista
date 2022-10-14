package br.com.voeairlines.treinamentopoo;

public class Algoritmo13 {

	double numero1, numero2, numero3, numero4;
	
	public double mediaPonderada(double numero1,double numero2,double numero3,double numero4) {
		
		double mediaPon = (numero1 + numero2 + numero3 + numero4) / (1 + 2 + 3 + 4);
		
		return mediaPon;
	}
	
	public String infoMediaPond() {
		return "Os números digitados "
				+numero1+", "+numero2+", "+numero3+", "+numero4
				+" com peso fixo de 1, 2, 3 e 4.";
	}
}
