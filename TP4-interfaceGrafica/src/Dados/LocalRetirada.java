package Dados;

public class LocalRetirada {
// Atributos 

	private String codigoLoja;
	private Endereco endereco;
	
	
// M�todos Especiais (construtor):
	
	public LocalRetirada(String codigoLoja, Endereco endereco) {
	this.codigoLoja = codigoLoja;
	this.endereco = endereco;
	}
	
// M�todos Acessores

	public String getC�digoLoja() {
		return codigoLoja;
	}

	public void setC�digoLoja(String c�digoLoja) {
		this.codigoLoja = c�digoLoja;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

// M�todos Personalizados:
	
	public void cadastrarLocalRetirada ( ) {
		
	}
	public void alterarLocalRetirada ( ) {
		
	}
	public void deletarLocalRetirada ( ) {
		
	}
}
