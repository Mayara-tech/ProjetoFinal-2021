package Validação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Dados.*;
import InterfaceGráfica.PaginaAcessoCliente;


public class ValidacaoCliente implements ActionListener {

	// Criando Jframe do Menu Principal com Components

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelNumeroIdentidade = new JLabel("Número de Identidade(RG): ");
	private JTextField valorNumeroIdentidade;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelEndereco = new JLabel("Endereco: ");
	private JTextField valorEndereco;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[20];
	private static DadoGeral dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int opcao, DadoGeral dado, 
			PaginaAcessoCliente paginacliente, int posicao) {

		if (opcao == 1) s = "Cadastro Cliente";
		if (opcao == 2) s = "Editar Cliente";


		janela = new JFrame(s);

		//  Preenche dados com dados do Cliente 
		if (opcao == 2) {
			valorNome = new JTextField(dados.getCliente()[posicao].getNome(), 200);
			valorNumeroIdentidade = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumeroIdentidade()),200);
			valorCPF = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumeroIdentidade()),200);;
			valorEndereco = new JTextField(String.valueOf(dados.getCliente()[posicao].getCpf()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getCliente()[posicao].getTelefone().getDdd()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getCliente()[posicao].getTelefone().getNumeroTelefone()),200);
			valorEmail = new JTextField(dados.getCliente()[posicao].getEmail(), 200);


		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorNumeroIdentidade = new JTextField(200);
			valorCPF = new JTextField(200);
			valorEndereco = new JTextField(200);
			valorDDD = new JTextField(200);
			valorTelefone = new JTextField(200);
			valorEmail = new JTextField(200);

			//  Personalizando Jframe 

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 180, 25);
		valorNome.setBounds(250, 20, 250, 25);
		labelNumeroIdentidade.setBounds(30, 50, 180, 25);
		valorNumeroIdentidade.setBounds(250, 50, 250, 25);
		labelCPF.setBounds(30, 80, 180, 25);
		valorCPF.setBounds(250, 80, 250, 25);		
		labelEndereco.setBounds(30, 110, 180, 25);
		valorEndereco.setBounds(250,110, 250, 25);
		labelTelefone.setBounds(30, 140, 180,25);
		valorTelefone.setBounds(250, 140, 250,25);
		labelEmail.setBounds(30, 170, 180, 25);
		valorEmail.setBounds(250, 170, 250, 25);

		//  Coloca os campos relacionados a endereco se Ciente
		if (opcao == 1 || opcao == 2 ) {
			this.janela.add(labelEndereco);
			this.janela.add(valorEndereco);

		}

		//   Coloca botoes de excluir e salvar
		if (opcao == 1|| opcao == 2) {
			botaoSalvar.setBounds(150, 250, 115, 30);
			botaoExcluir.setBounds(245, 250, 115, 30);
			this.janela.add(botaoExcluir);
		}

		// Add components

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelNumeroIdentidade);
		this.janela.add(valorNumeroIdentidade);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(botaoSalvar);

		//Configurações da Jframe	

		this.janela.setLayout(null);
		this.janela.setSize(700, 350);
		this.janela.setVisible(true);


		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res = false;
				if(opcao == 1) //cadastro de novo Cliente
					novoDado[0] = Integer.toString(dados.getQuantCliente());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorNumeroIdentidade.getText();
				novoDado[3] =  valorCPF.getText();
				novoDado[4] =  valorEndereco.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();
				novoDado[7] =  valorEmail.getText();

				if (opcao == 1 || opcao == 2) {
					novoDado[2] =  valorEndereco.getText();
					res = dados.inserirEditarCliente(novoDado);
				} else {
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui Cliente
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
			}

		}
	}

	//Mensagens de retorno

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, número identidade, telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o Cliente está Cadastrado e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}


}
