package br.com.voeairlines.treinamentopoo;

public class Algoritmo25 {

	double raioDaLata;
	double alturaDaLata;
	
	public double calculoVolume(double raioDaLata, double alturaDaLata) {
		
		double volume = Math.PI * Math.pow(raioDaLata, 2) * alturaDaLata;
		
		return volume;
	}

	
}
