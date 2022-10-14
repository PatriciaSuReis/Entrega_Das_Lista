package br.com.voeairlines.treinamentopoo;

public class Algoritmo14 {
	
	private double saldoAplicacao;
	private double reajusteSaldo;
	
	public Algoritmo14() {	}

	public void setSaldoAplicacao(double saldoAplicacao) {
		this.saldoAplicacao = saldoAplicacao;
	}

	public double reajusteSaldo() {
		reajusteSaldo = saldoAplicacao + (saldoAplicacao * 0.01);
		return reajusteSaldo;
	}
	
	public String mostraMSG() {
		return "Saldo para aplicação R$" + saldoAplicacao +
			   "\nSeu saldo atual R$";
	}
}
