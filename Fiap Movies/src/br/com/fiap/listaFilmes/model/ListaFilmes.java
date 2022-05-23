package br.com.fiap.listaFilmes.model;

import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListaFilmes {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String sinopse;
	private String Genero;
	private String ondeAssistir;
	private boolean assistido;
	private int starRate;
	
	
	
	public String getGenero() {
		return Genero;
	}
	@Override
	public String toString() {
		return "ListaFilmes [titulo=" + titulo + ", sinopse=" + sinopse + ", Genero=" + Genero + ", ondeAssistir="
				+ ondeAssistir + ", assistido=" + assistido + ", starRate=" + starRate + "]";
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getOndeAssistir() {
		return ondeAssistir;
	}
	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}
	public String isAssistido(boolean assistido) {
		String ass = "Não Assistido";
		
		if(assistido) {
			ass = "Assistido";
		}
		
		return ass;
	}
	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}
	public Long getStarRate() {
		return (long) starRate;
	}
	public void setStarRate(int starRate) {
		this.starRate = starRate;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Vector<String> getData() {
		
		Vector<String> data = new Vector<String>(); 
		data.add(id.toString());
		data.add(titulo);
		data.add(sinopse);
		data.add(Genero);
		data.add(ondeAssistir);
		data.add(isAssistido(assistido));
		data.add(getStarRate().toString());
	
		
		return data;
	}
	
	
	
}
