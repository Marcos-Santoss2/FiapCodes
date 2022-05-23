package br.com.fiap.listaFilmes.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.function.ToIntFunction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import br.com.fiap.listaFilmes.App;
import br.com.fiap.listaFilmes.dao.FilmesDao;
import br.com.fiap.listaFilmes.model.ListaFilmes;
import br.com.fiap.listaFilmes.view.Janela;

public class BotaoListener implements ActionListener, MouseListener{

	 private Janela janela; 
	 FilmesDao dao = new FilmesDao();
	 
	 public BotaoListener(Janela janela) {
			this.janela = janela;
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ListaFilmes listaFilmes = new ListaFilmes();
		listaFilmes.setTitulo(janela.getInputText().getText());
		listaFilmes.setSinopse(janela.getMeuTextArea().getText());
		listaFilmes.setGenero(janela.getGenero().getSelectedItem().toString());
		listaFilmes.setOndeAssistir(janela.getRadios().getSelectedButtonText());
		listaFilmes.setAssistido(janela.getAssistido().isSelected());
		listaFilmes.setStarRate(janela.getStarRater().getSelection());
		
		dao.inserir(listaFilmes);
	
		janela.CarregarDados();
		
		List<ListaFilmes> lista = dao.listarTodos();
		
	
		
		
	
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2) {
			int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que quer apagar o filme?");
			if(resposta == JOptionPane.YES_OPTION) {
				JTable tabela = (JTable) e.getSource();
				String id = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
				dao.apagar(Long.valueOf(id));
				janela.CarregarDados();
			}
		}	
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
