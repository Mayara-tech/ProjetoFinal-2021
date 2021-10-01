package InterfaceGráfica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ControleGeralDados.ControleGeralDado;



public class PaginaInicial implements ActionListener {

	// Criando Jframe do Menu Principal com Components

	private static JFrame empresa = new JFrame("TOYS UNION");
	private static JLabel paginaInicial = new JLabel("TOYS UNION");
	private static JLabel menuPrincipal = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Area do Cliente");
	private static JButton loja = new JButton("conheça nossas Lojas");
	private static JButton produto = new JButton("Nossos Brinquedos");
	public static ControleGeralDado dados = new ControleGeralDado();

	//Personalizando Jframe 

	public PaginaInicial() {
		paginaInicial.setFont(new Font("Arial", Font.BOLD, 20));
		paginaInicial.setBounds(140, 10, 250, 30);
		menuPrincipal.setFont(new Font("Arial", Font.BOLD, 16));
		menuPrincipal.setBounds(150, 40, 250, 30);
		loja.setBounds(100, 200, 200, 30);
		produto.setBounds(100, 100, 200, 30);
		cliente.setBounds(100, 150, 200, 30);


		// Add components

		empresa.add(paginaInicial);
		empresa.add(menuPrincipal);
		empresa.add(produto);
		empresa.add(cliente);
		empresa.add(loja);

		//  Configurações da Jframe
		empresa.setLayout(null);
		empresa.setSize(420, 350);
		empresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		empresa.setVisible(true);
	}

	//  Criando Action Listener das Opções

	public static void main(String[] args) {
		PaginaInicial menu = new PaginaInicial();

		cliente.addActionListener(menu);
		produto.addActionListener(menu);
		loja.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Configurando Action Listener

		if(src == produto)
			new PaginaAcessoProduto().mostrarDados(dados, 1);;

		if(src == cliente)
			new PaginaAcessoCliente().mostrarDados(dados, 1);

		if(src == loja)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
							+ "relacionadas a Loja ", null, 
							JOptionPane.INFORMATION_MESSAGE);


	}


}
