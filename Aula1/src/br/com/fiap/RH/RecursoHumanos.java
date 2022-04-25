package br.com.fiap.RH;

public class RecursoHumanos {

	public static void main(String[] args) {
		Engenheiro engenheiro = new Engenheiro();

		engenheiro.setSalarioBase(5000);
		Presidente presidente = new Presidente();

		System.out.println(" Salario do engenheiro " + engenheiro.getSalarioBase());
		
		presidente.setSalarioBase(8000);
		presidente.setValorDasCotas(10000);
		
		
		System.out.println("Salario do presidente " + presidente.getSalarioBase());
		
		
		Gerente gerente = new Gerente();
		
		
		
		
		

	}

}
