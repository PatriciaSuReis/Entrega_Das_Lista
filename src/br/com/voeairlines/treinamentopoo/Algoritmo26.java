package br.com.voeairlines.treinamentopoo;

public class Algoritmo26 {

	double prestacao;
	double taxa;
	int atraso;
	double prestacaoAtrasada;
	
	public double prestacaoAtrasada(double prestacao, double taxa, int atraso) {
		
		prestacaoAtrasada = prestacao + (prestacao * (taxa / 100) * atraso);
		
		return prestacaoAtrasada;
	}
}
