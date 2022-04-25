package br.com.fiap.RH;

public class Engenheiro extends Empregado {
	
	
	private String departamento;
	private String crea;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	
	@Override
	public double calcularSalario() {
		return getSalarioBase() * 1.5;
	} 
	
	
	

}
