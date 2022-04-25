package br.com.exerciocio1.Modulo;

public class Jogador {

	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado = false;

	public Jogador(){
		
		this.nome = "Jogador Anonimo";
		xp = 0;
		hp = 100;
		envenenado = false;
		
	}
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	public int getXp() {
		return this.xp;
	}
	
	public int getHp() {
		
		if(envenenado == true) {
			
			hp = hp - 3;	
			
		}
		
		return hp;
	}
	
	public boolean isEnvenenado() {
			envenenado = true;		
	return envenenado;
	}
	
	public boolean receberAntidoto() {
		
		envenenado = false;
		
	return envenenado;
	}
	
	public int receberDano (int pontos) {
		
		if(hp > pontos && pontos > 0) {
		
		hp = hp - pontos;
		
		}else{
			hp = 0;
		}
		
		
		
		
		if(envenenado == true ) {
			
			hp = hp - 3;	
			
		}
		

		if(envenenado == true && hp < 3 ) {
			
			hp = 0;	
			
		}
		
		
		
		
		return hp;
	}
	
	public int receberCura (int pontos) {
		if(pontos > 0) {
			
			hp = hp + pontos;
			
		}
		
		return hp;
		
	}
	
	public int ganharExperiencia (int pontos) {
		if(pontos > 0) {
			
			xp = xp + pontos;
			
		}
		
		return xp;
		
	}
	
	
	
	
	
	
	
	
	
	
}
