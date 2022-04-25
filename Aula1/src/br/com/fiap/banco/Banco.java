package br.com.fiap.banco;

public class Banco {

	public static void main(String[] args) {
	
		Conta conta = new Conta();

		conta.setTitular("marcos!");
		
		System.out.println(conta.getTitular());
		
	}

}
