package InterfaceGráfica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import ControleGeralDados.*;
import Dados.*;
import Validação.*;

public class PaginaAcessoCliente implements ActionListener, ListSelectionListener {

	private JFrame paginaAcessoCliente;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton editarCliente;
	private static DadoGeral dados;
	private JList<String> listaClienteCadastrados;
	private String[] listaNome = new String[150];

	public void mostrarDados(ControleGeralDado dado, int op){
		JList<String> listaClienteCadastrados;

		// Criando a visualização da lista de Clientes
		switch (op) {
		case 1:
			listaNome = new DadoGeral().getNomeAluno();
			listaClienteCadastrados = new JList<String>(listaNome);
			paginaAcessoCliente = new JFrame("Bem vindo a área do Cliente");
			titulo = new JLabel("Área do Cliente");
			cadastroCliente = new JButton("Cadastrar");
			editarCliente = new JButton("Editar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(140, 10, 250, 30);
			listaClienteCadastrados.setBounds(100, 2000, 200, 30);
			listaClienteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClienteCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(100, 100, 200, 30);
			editarCliente.setBounds(100, 150, 200, 30);

			paginaAcessoCliente.setLayout(null);

			paginaAcessoCliente.add(titulo);
			paginaAcessoCliente.add(listaClienteCadastrados);
			paginaAcessoCliente.add(cadastroCliente);
			paginaAcessoCliente.add(editarCliente);

			paginaAcessoCliente.setSize(400, 250);
			paginaAcessoCliente.setVisible(true);

			cadastroCliente.addActionListener(this);
			editarCliente.addActionListener(this);
			listaClienteCadastrados.addListSelectionListener(this);

			break;}
	}

	//Captura eventos relacionados aos botões da interface

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		//Cadastro Novo Cliente

		if(src == cadastroCliente)
			new ValidacaoCliente().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de Clientes mostrada no JList

		if(src == editarCliente) {
			listaClienteCadastrados.setListData(new PaginaAcessoCliente().getCliente());			
			listaClienteCadastrados.updateUI();}
	}


	private String[] getCliente() {
		return null;
	}

	// Captura eventos relacionados ao JList

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClienteCadastrados) {
			new ValidacaoCliente().inserirEditar(3, dados, this, 
					listaClienteCadastrados.getSelectedIndex());
		}
	}

}

