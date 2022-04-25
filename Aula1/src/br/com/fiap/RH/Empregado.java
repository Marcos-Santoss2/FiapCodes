package br.com.fiap.RH;

public abstract class Empregado {

	private String nome;
	private int codigo;
	private double salarioBase;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	public double calcularSalario () {
		return salarioBase;
	}
	
	
	
	
	
}
