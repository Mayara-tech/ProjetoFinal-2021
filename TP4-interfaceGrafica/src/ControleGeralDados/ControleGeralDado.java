package ControleGeralDados;

import Dados.*;
import Brinquedos.*;


public class ControleGeralDado {
	DadoGeral dado = new DadoGeral ();
	DadoBrinquedo brinquedo = new DadoBrinquedo(null, null, null, null);{
		dado.fillWithSomeData();{
			brinquedo.fillWithSomeData();}
	}

	// Métodos Acessores

	public DadoGeral getDado() {
		return dado;
	}
	public void setDado(DadoGeral dado) {
		this.dado = dado;
	}
	public DadoBrinquedo getBrinquedo() {
		return brinquedo;
	}
	public void setBrinquedo(DadoBrinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}

	//   Criando o Cadastrar e Editar Cliente 

	public boolean inserirEditarClientee(String[] Cliente) {
		if(!Cliente[3].matches("[0-9]+") || !Cliente[4].matches("[0-9]+") || 
				!Cliente[5].matches("[0-9]+") || !Cliente[6].matches("[0-9]+")) {
			return false;
		} else {
			Cliente cliente = new Cliente(Cliente[1],Integer.parseInt(Cliente[2]),Integer.parseInt(Cliente[3]),
					new Endereco (Integer.parseInt(Cliente[4]), 
							new Telefone(Integer.parseInt(Cliente[5]), Cliente[6],Cliente[7])), null, null, null);
			dado.fillWithSomeData();
			return true;
		}
		//  Criando o Deletar Cliente		
	}
	public boolean removerCliente(int i) {
		int quantCliente = dado.getQuantCliente();
		String Clientedeletado = dado.getCliente()[i].getNome();
		String deletar;
		for (int C = 0; C < quantCliente; C++) {
			deletar = dado.getCliente()[C].deletarCliente();
			if(Clientedeletado.compareTo(deletar) == 0) 
				return false;
			// Não é possível deletar Cliente

		}
		if(i == (dado.getQuantCliente() - 1)) { 
			// O Cliente poderá ser removido está no final do array
			dado.setQuantCliente(dado.getQuantCliente() - 1);
			dado.getCliente()[dado.getQuantCliente()] = null;
			return true;

		} else { 
		}
		return false;
	}
	// ------------------------------------------------------------------------------------------------------------------------------
	//Criando o Cadastrar e Editar Produto

	public boolean inserirEditarProduto(String[] DadoBrinquedo) {
		if(!DadoBrinquedo[3].matches("[0-9]+") || !DadoBrinquedo[4].matches("[0-9]+") || 
				!DadoBrinquedo[5].matches("[0-9]+") || !DadoBrinquedo[6].matches("[0-9]+")) {
			return false;
		} else {
			DadoBrinquedo produto = new DadoBrinquedo(DadoBrinquedo[1],Integer.parseInt(DadoBrinquedo[2]),Integer.parseInt(DadoBrinquedo[3]), DadoBrinquedo);
			dado.fillWithSomeData();
			return true;
		}
		//Criando o Deletar Produto	
	}
	public boolean removerProduto(int i) {
		int quantBrinquedo = dado.getQuantBrinquedo();
		String Brinquedodeletado = dado.getBrinquedo()[i].getNomeBrinquedo();
		String deletar;
		for (int C = 0; C < quantBrinquedo; C++) {
			deletar = dado.getBrinquedo()[C].deletarBrinquedo();
			if(Brinquedodeletado.compareTo(deletar) == 0) 
				return false;
			//Não é possível deletar Produto

		}
		if(i == (dado.getQuantBrinquedo() - 1)) { 
			//O Produto poderá ser removido está no final do array
			dado.setQuantBrinquedo(dado.getQuantCliente() - 1);
			dado.getCliente()[dado.getQuantCliente()] = null;
			return true;

		} else { 
		}
		return false;
	}
}



