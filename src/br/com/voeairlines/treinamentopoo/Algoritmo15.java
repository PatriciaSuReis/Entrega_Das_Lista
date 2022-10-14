package br.com.voeairlines.treinamentopoo;

public class Algoritmo15 {

	private double salarioMin;
	private double quilowatts;
	double custo;
	double valorPagar;
	double valorComDesconto;
	
	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}
	
	public void setQuilowatts(double quilowatts) {
		this.quilowatts = quilowatts;
	}
	
	public double custo() {
		custo = salarioMin / 7 / 100;
		return custo;
	}
	
	public double valorAPagar() {
		valorPagar = custo * quilowatts;
		return valorPagar;
	}
	
	public double valorDesconto() {
		valorComDesconto = valorPagar - (valorPagar * 10) / 100;
		return valorComDesconto;
	}

	
}
