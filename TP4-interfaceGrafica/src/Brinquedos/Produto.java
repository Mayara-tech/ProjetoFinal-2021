package Brinquedos;

public abstract class Produto {
// Atributos 
	
	private String nomeProduto;
	private String especificaçãoBrinquedo;
	private Float preco;
	private String descricao;

// Métodos Especiais (construtor):
	
	public Produto(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao) {
		this.nomeProduto = nomeProduto;
		this.especificaçãoBrinquedo = especificaçãoBrinquedo;
		this.preco = preco;
		this.descricao = descricao;
	}

// Métodos Acessores: 

	public String getNomeProduto() {
	return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
	}

	public String getEspecificaçãoBrinquedo() {
	return especificaçãoBrinquedo;
	}

	public void setEspecificaçãoBrinquedo(String especificaçãoBrinquedo) {
	this.especificaçãoBrinquedo = especificaçãoBrinquedo;
	}
	
	public Float getPreco() {
	return preco;
	}

	public void setPreco(Float preco) {
	this.preco = preco;
	}

	public String getDescricao() {
	return descricao;
	}

	public void setDescricao(String descricao) {
	this.descricao = descricao;
	}

// Métodos personalizados 
	
	public void cadastrarProduto () {

	}
	public void buscarProduto ( ) {
		
	}
	public void alterarDadosProduto ( ) {
		
	}
	public void deletarProduto ( ) {
		
	}
}
