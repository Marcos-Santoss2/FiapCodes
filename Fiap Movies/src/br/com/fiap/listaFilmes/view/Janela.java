package br.com.fiap.listaFilmes.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.LineEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.listaFilmes.components.BotaoListener;
import br.com.fiap.listaFilmes.components.InputText;
import br.com.fiap.listaFilmes.components.MeuLabel;
import br.com.fiap.listaFilmes.components.MeuRadioGroup;
import br.com.fiap.listaFilmes.components.MeuTextArea;
import br.com.fiap.listaFilmes.components.StarRater;
import br.com.fiap.listaFilmes.dao.FilmesDao;
import br.com.fiap.listaFilmes.model.ListaFilmes;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class Janela extends JFrame{
	

	InputText inputText = new InputText();
	MeuTextArea meuTextArea = new MeuTextArea();
	MeuLabel titulo = new MeuLabel("Titulo");
	MeuLabel sinopse = new MeuLabel(" Sinopse");
	MeuLabel generoLabel = new MeuLabel("Genero");
	MeuLabel avalicao = new MeuLabel("Avaliação");
	JButton salvar = new JButton("Salvar");
	JButton cancelar = new JButton("Cancelar");
	String[] generos = {"", "Comédia", "Ação", "Ficção"};
	JComboBox<String> genero = new JComboBox<>(generos);
	JCheckBox assistido = new JCheckBox("Assistido");
    StarRater starRater = new StarRater();
	
	MeuRadioGroup radio = new MeuRadioGroup(Arrays.asList("Netflix", "Prime Video", "Pirate Bay"));
	String[] colunas =  {"Id", "Titulo", "Sinopse", "Genero", "Onde Assistir", "Assistido", "StasRate"};
	DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);
	JTable tabela = new JTable(tableModel);
	
	BotaoListener listenerSalvar = new BotaoListener(this); 
	
	
	
	JPanel centro = new JPanel(new GridLayout(0,1,0,0));
	
	JPanel lineEnd = new JPanel();

	JPanel lineStart = new JPanel();

	JPanel pageEnd = new JPanel(new FlowLayout());

	JTabbedPane abas = new JTabbedPane();
	
	public Janela() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init() {
	
	JPanel cadastro = new JPanel();
	cadastro.setLayout(new BorderLayout(20,30));
	
	
	
	//Painel do centro
	
	centro.add(titulo);
	centro.add(inputText);
	centro.add(sinopse);
	centro.add(meuTextArea);
	centro.add(generoLabel);
	
    centro.add(genero);
    
    //Painel da Esquerda
    
    
	lineEnd.setLayout(new BoxLayout(lineEnd, BoxLayout.PAGE_AXIS));
	MeuLabel ondeAssitir = new MeuLabel("Onde Assistir");
	lineEnd.add(Box.createVerticalStrut(10));
	lineEnd.add(ondeAssitir);
 	
    lineEnd.add(radio.getComponent(0));
    lineEnd.add(radio.getComponent(0));
    lineEnd.add(radio.getComponent(0));
  
   

    lineEnd.add(assistido);
    lineEnd.add(avalicao);

    lineEnd.add(starRater);
    
	//Painel da direita
   
    JLabel img = new JLabel(new ImageIcon("src/Imagem/Doutor.jpg"));
    lineStart.add(Box.createHorizontalStrut(10));
    lineStart.add(img);
    
    
    // Painel  de baixo 

	pageEnd.add(Box.createHorizontalStrut(15));
	pageEnd.add(salvar);
	pageEnd.add(cancelar);
	
	
	//Adicionando tudo a view cadastro
	
	cadastro.add(lineStart,BorderLayout.LINE_START);
	cadastro.add(centro, BorderLayout.CENTER);
	cadastro.add(lineEnd, BorderLayout.LINE_END);
	cadastro.add(pageEnd, BorderLayout.PAGE_END);
	

	//Adicionando abas
	abas.add("Cadastro", cadastro);
	
	
	
	
	abas.add("Lista", new JScrollPane(tabela));
	
	
	add(abas);
	setTitle("FIAP MOVIES");
	
	CarregarDados();
	
	tabela.addMouseListener(listenerSalvar);
	tabela.setDefaultEditor(Object.class, null);
	
	
	setVisible(true);
	
	
	salvar.addActionListener(listenerSalvar);
	
	}
	public void CarregarDados() {
		
		tableModel.setRowCount(0);
		List<ListaFilmes> lista = new FilmesDao().listarTodos();
		lista.forEach(filme -> tableModel.addRow(filme.getData()));
		
	}

	public InputText getInputText() {
		return inputText;
	}

	public MeuTextArea getMeuTextArea() {
		return meuTextArea;
	}

	public JComboBox<String> getGenero() {
		return genero;
	}

	public JCheckBox getAssistido() {
		return assistido;
	}

	public MeuRadioGroup getRadios() {
		return radio;
	}

	public StarRater getStarRater() {
		return starRater;
	}
}
	


