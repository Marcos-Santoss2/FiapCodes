package br.com.fiap.veterinario;

import javax.swing.JOptionPane;

public class Gatil {

	public static void main(String[] args) {
		Gato felix = new Gato();
		felix.nome= "felix";
		felix.cor = "preto";
		felix.genero ="M";		
		felix.miar();
		JOptionPane.showConfirmDialog(null, felix.nome);
		
	} 


}
