package InterfaceGráfica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import ControleGeralDados.ControleGeralDado;
import Brinquedos.DadoBrinquedo;
import Validação.ValidacaoProduto;

public class PaginaAcessoProduto implements ActionListener, ListSelectionListener { 
	
	private JFrame paginaAcessoProduto;
	private JLabel titulo;
	private JButton cadastroProduto;
	private JButton editarProduto;
	private static DadoBrinquedo dados;
	private JList<String> listaClienteCadastrados;
	private String[] listaNome = new String[150];

	public void mostrarDados(ControleGeralDado dado, int op){
		JList<String> listaBrinquedosCadastrados = null;

		// Criando a visualização da lista de Clientes
		switch (op) {
		case 1:
			listaNome = new DadoBrinquedo(null, null, null, null).getNomeBrinquedo();
			listaClienteCadastrados = new JList<String>(listaNome);
			paginaAcessoProduto = new JFrame("Conheça nossos Brinquedos");
			titulo = new JLabel("Brinquedos");
			cadastroProduto = new JButton("Cadastrar");
			editarProduto = new JButton("Editar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 10, 250, 30);
			listaBrinquedosCadastrados.setBounds(100, 2000, 200, 30);
			listaBrinquedosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBrinquedosCadastrados.setVisibleRowCount(10);

			cadastroProduto.setBounds(100, 100, 200, 30);
			editarProduto.setBounds(100, 150, 200, 30);

			paginaAcessoProduto.setLayout(null);

			paginaAcessoProduto.add(titulo);
			paginaAcessoProduto.add(listaClienteCadastrados);
			paginaAcessoProduto.add(cadastroProduto);
			paginaAcessoProduto.add(editarProduto);

			paginaAcessoProduto.setSize(400, 250);
			paginaAcessoProduto.setVisible(true);

			cadastroProduto.addActionListener(this);
			editarProduto.addActionListener(this);
			listaBrinquedosCadastrados.addListSelectionListener(this);

			break;}
	}

	//Captura eventos relacionados aos botões da interface

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		//Cadastro Novo Cliente

		if(src == cadastroProduto)
			new ValidacaoProduto().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de Clientes mostrada no JList

		if(src == editarProduto) {
			listaBrinquedosCadastrados.setListData(new PaginaAcessoProduto().getBrinquedo());			
			listaBrinquedosCadastrados.updateUI();}
	}


	private String[] getBrinquedo() {
		return null;
	}

	// Captura eventos relacionados ao JList

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaBrinquedosCadastrados) {
			new ValidacaoProduto().inserirEditar(3, dados, this, 
					listaBrinquedosCadastrados.getSelectedIndex());
		}
	}

}
