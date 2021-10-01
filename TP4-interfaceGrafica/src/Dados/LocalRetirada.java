package Dados;

public class LocalRetirada {
// Atributos 

	private String codigoLoja;
	private Endereco endereco;
	
	
// Métodos Especiais (construtor):
	
	public LocalRetirada(String codigoLoja, Endereco endereco) {
	this.codigoLoja = codigoLoja;
	this.endereco = endereco;
	}
	
// Métodos Acessores

	public String getCódigoLoja() {
		return codigoLoja;
	}

	public void setCódigoLoja(String códigoLoja) {
		this.codigoLoja = códigoLoja;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

// Métodos Personalizados:
	
	public void cadastrarLocalRetirada ( ) {
		
	}
	public void alterarLocalRetirada ( ) {
		
	}
	public void deletarLocalRetirada ( ) {
		
	}
}
