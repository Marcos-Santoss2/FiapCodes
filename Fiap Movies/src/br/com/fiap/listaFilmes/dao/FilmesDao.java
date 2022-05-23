package br.com.fiap.listaFilmes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.listaFilmes.model.ListaFilmes;

public class FilmesDao {

	EntityManager manager = JpaManager.getManager();
	
	public void inserir(ListaFilmes filme) {
			
			manager.getTransaction().begin();
			manager.persist(filme);
			manager.getTransaction().commit();
	
		
	}
	
	public List<ListaFilmes> listarTodos() {
		TypedQuery<ListaFilmes> query = 
				manager.createQuery("SELECT l FROM ListaFilmes l", ListaFilmes.class);
		return query.getResultList();

	}
	
	public void apagar(ListaFilmes filme) {
		manager.getTransaction().begin();
		manager.remove(filme);
		manager.getTransaction().commit();
	}

	public void apagar(Long id) {
		apagar(buscarPorId(id));
	}

	public ListaFilmes buscarPorId(Long id) {
		return manager.find(ListaFilmes.class, id);
	}
	
	
}
