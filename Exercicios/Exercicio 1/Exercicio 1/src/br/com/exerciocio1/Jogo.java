package br.com.exerciocio1;

import br.com.exerciocio1.Modulo.Jogador;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador("Marcos");
		
		
		System.out.println(jogador2.isEnvenenado());		
		System.out.println(jogador2.receberDano(56));
		System.out.println(jogador2.getHp());	
				
		
		System.out.println(jogador1.isEnvenenado());
		System.out.println(jogador1.getHp());	

	}

}
