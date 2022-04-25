package br.com.fiap.listaFilmes;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class App {

	public static void main(String[] args) {
		
		JFrame principal = new JFrame();
		
		JPanel janela = new JPanel();
		janela.setLayout(new BorderLayout(20,30));
		
		
		InputText inputText = new InputText();
		MeuTextArea meuTextArea = new MeuTextArea();
		MeuLabel titulo = new MeuLabel("Titulo");
		MeuLabel sinopse = new MeuLabel(" Sinopse");
		MeuLabel genero = new MeuLabel("Genero");
		
		
		
		JPanel centro = new JPanel(new GridLayout(0,1,0,0));
		centro.add(titulo);
		centro.add(inputText);
		centro.add(sinopse);
		centro.add(meuTextArea);
		centro.add(genero);
		String[] generos = {"Comédia", "Ação", "Ficção"};
	    centro.add(new JComboBox<>(generos));
	    
	    
	    
	    
	    JPanel lineEnd = new JPanel();
		lineEnd.setLayout(new BoxLayout(lineEnd, BoxLayout.PAGE_AXIS));
		MeuLabel ondeAssitir = new MeuLabel("Onde Assistir");
		lineEnd.add(Box.createVerticalStrut(10));
		lineEnd.add(ondeAssitir);
		JRadioButton r1 = new JRadioButton("Netflix");
        JRadioButton r2 = new JRadioButton("Prime Video");
        JRadioButton r3 = new JRadioButton("Pirate Bay");
        ButtonGroup radios = new ButtonGroup();
        
        radios.add(r1);
        radios.add(r2);
        radios.add(r3);
        
        lineEnd.add(r1);
        lineEnd.add(r2);
        lineEnd.add(r3);
        JCheckBox assistido = new JCheckBox("Assistido");
        lineEnd.add(assistido);
       
        StarRater starRater = new StarRater();
        lineEnd.add(starRater);
	    
		
        JPanel lineStart = new JPanel();
        JLabel img = new JLabel(new ImageIcon("src/Imagem/Doutor.jpg"));
        lineStart.add(Box.createHorizontalStrut(20));
        lineStart.add(img);
        
        
        
		JButton salvar = new JButton("Salvar");
		JButton cancelar = new JButton("Cancelar");
		JPanel pageEnd = new JPanel(new FlowLayout());
		pageEnd.add(salvar);
		pageEnd.add(cancelar);
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", janela);
		abas.add("Lista", new JLabel("Segunda aba"));
		
		
		janela.add(lineStart,BorderLayout.LINE_START);
		janela.add(centro, BorderLayout.CENTER);
		janela.add(lineEnd, BorderLayout.LINE_END);
		janela.add(pageEnd, BorderLayout.PAGE_END);
		
		principal.add(abas);
		
		
		
		principal.setVisible(true);
		principal.setSize(600, 300);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setTitle("FIAP MOVIES");
		
		
		
	}

}
