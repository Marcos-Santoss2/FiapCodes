package br.com.fiap.RH;

public final class Presidente extends Empregado {

	private double valorDasCotas;

	public double getValorDasCotas() {
		return valorDasCotas;
	}

	public void setValorDasCotas(double valorDasCotas) {
		this.valorDasCotas = valorDasCotas;
	}

	
	@Override
	public double calcularSalario() {
		
		return getSalarioBase() + getValorDasCotas();
	}
	
	
	
	
	
	
	
	
}
