package br.com.fiap.RH;

public class Gerente extends Empregado {

	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	private double bonus;

	@Override
	public double calcularSalario() {
		
		return getSalarioBase() + getBonus();
	}

	
	
	
}
