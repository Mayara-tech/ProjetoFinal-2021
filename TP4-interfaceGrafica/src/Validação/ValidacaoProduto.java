package Validação;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import Brinquedos.*;
	import ControleGeralDados.*;
	import InterfaceGráfica.*;


	public class ValidacaoProduto implements ActionListener {

		// Criando Jframe do Menu Principal com Components

		private JFrame janela;
		private JLabel labelBola = new JLabel("Bola: ");
		private JTextField valorBola;
		private JLabel labelBoneca = new JLabel("Boneca: ");
		private JTextField valorBoneca;
		private JLabel labelBoneco = new JLabel("Boneco: ");
		private JTextField valorBoneco;
		private JLabel labelBrinquedoBebe = new JLabel("Brinquedos para Bêbe: ");
		private JTextField valorBrinquedoBebe;
		private JLabel labelBrinquedoEducativo= new JLabel("BrinquedoEducativo: ");
		private JTextField valorBrinquedoEducativo;
		private JLabel labelCarrinhoeCIA = new JLabel("Carrinho e Cia:");
		private JTextField valorCarrinhoeCIA;
		private JLabel labelJogo = new JLabel("Jogos: ");
		private JTextField valorJogo;
		private JButton botaoExcluir = new JButton("Excluir");
		private JButton botaoSalvar = new JButton("Salvar");
		private String[] novoDado = new String[20];
		private static DadoBrinquedo dados;
		private int posicao;
		private int opcao;
		private String s;

		public void inserirEditar(int opcao, DadoBrinquedo dado, 
				PaginaAcessoProduto paginaProduto, int posicao) {

			if (opcao == 1) s = "Cadastro Produto";
			if (opcao == 2) s = "Editar Produto";


			janela = new JFrame(s);

			//  Preenche dados com dados do Produto
			if (opcao == 2) {
				valorBola= new JTextField(dados.getBrinquedo()[posicao].getBola(), 200);
				valorBoneca = new JTextField(String.valueOf(dados.getBrinquedo()[posicao].getBoneca()),200);
				valorBoneco = new JTextField(String.valueOf(dados.getBrinquedo()[posicao].getNumeroBoneco()),200);;
				valorBrinquedoBebe = new JTextField(String.valueOf(dados.getBrinquedo()[posicao].BrinquedoBebe()), 200);
				valorBrinquedoEducativo = new JTextField(String.valueOf(dados.getBrinquedo()[posicao].BrinquedoEducativo()), 200);
				valorCarrinhoeCIA = new JTextField(String.valueOf(dados.getBrinquedo()[posicao].CarrinhoeCIA()),200);
				valorJogo= new JTextField(dados.getBrinquedo()[posicao].getJogo(), 200);


			} else { //Não preenche com dados

				valorBola = new JTextField(200);
				valorBoneca= new JTextField(200);
				valorBoneco = new JTextField(200);
				valorBrinquedoBebe = new JTextField(200);
				valorBrinquedoEducativo = new JTextField(200);
				valorCarrinhoeCIA = new JTextField(200);
				valorJogo = new JTextField(200);

				//  Personalizando Jframe 

				botaoSalvar.setBounds(245, 175, 115, 30);
			}

			labelBola.setBounds(30, 20, 180, 25);
			valorBola.setBounds(250, 20, 250, 25);
			labelBoneca.setBounds(30, 50, 180, 25);
			valorBoneca.setBounds(250, 50, 250, 25);
			labelBoneco.setBounds(30, 80, 180, 25);
			valorBoneco.setBounds(250, 80, 250, 25);		
			labelBrinquedoBebe.setBounds(30, 110, 180, 25);
			valorBrinquedoBebe.setBounds(250,110, 250, 25);
			labelBrinquedoEducativo.setBounds(30, 140, 180,25);
			valorBrinquedoEducativo.setBounds(250, 140, 250,25);
			labelCarrinhoeCIA.setBounds(30, 170, 180, 25);
			valorCarrinhoeCIA.setBounds(250, 170, 250, 25);
			labelJogo.setBounds(30, 200, 180, 25);
			valorJogo.setBounds(250, 200, 250, 25);

			//   Coloca botoes de excluir e salvar
			if (opcao == 1|| opcao == 2) {
				botaoSalvar.setBounds(150, 250, 115, 30);
				botaoExcluir.setBounds(245, 250, 115, 30);
				this.janela.add(botaoExcluir);
			}

			// Add components

			this.janela.add(labelBola);
			this.janela.add(valorBola);
			this.janela.add(labelBoneca);
			this.janela.add(valorBoneca);
			this.janela.add(labelBoneco);
			this.janela.add(valorBoneco);
			this.janela.add(labelBrinquedoBebe);
			this.janela.add(valorBrinquedoBebe);
			this.janela.add(labelBrinquedoEducativo);
			this.janela.add(valorBrinquedoEducativo);
			this.janela.add(labelCarrinhoeCIA);
			this.janela.add(valorCarrinhoeCIA);
			this.janela.add(labelJogo);
			this.janela.add(valorJogo);
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
					if(opcao == 1) //cadastro de novo Produto
						novoDado[0] = Integer.toString(dados.getQuantBrinquedo());
					else // edicao de dado existente
						novoDado[0] = Integer.toString(posicao);

					novoDado[1] =  valorBola.getText();
					novoDado[2] =  valorBoneca.getText();
					novoDado[3] =  valorBoneco.getText();
					novoDado[4] =  valorBrinquedoBebe.getText();
					novoDado[5] =  valorBrinquedoEducativo.getText();
					novoDado[6] =  valorCarrinhoeCIA.getText();
					novoDado[7] =  valorJogo.getText();

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
