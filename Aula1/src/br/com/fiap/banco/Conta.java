package br.com.fiap.banco;
 
public class Conta {
	
	 private String titular;
	 private int numero;
	 private double saldo;
	 private double juros;
	
	 
	 public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
}
