package Brinquedos;

public abstract class Produto {
// Atributos 
	
	private String nomeProduto;
	private String especifica��oBrinquedo;
	private Float preco;
	private String descricao;

// M�todos Especiais (construtor):
	
	public Produto(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao) {
		this.nomeProduto = nomeProduto;
		this.especifica��oBrinquedo = especifica��oBrinquedo;
		this.preco = preco;
		this.descricao = descricao;
	}

// M�todos Acessores: 

	public String getNomeProduto() {
	return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
	}

	public String getEspecifica��oBrinquedo() {
	return especifica��oBrinquedo;
	}

	public void setEspecifica��oBrinquedo(String especifica��oBrinquedo) {
	this.especifica��oBrinquedo = especifica��oBrinquedo;
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

// M�todos personalizados 
	
	public void cadastrarProduto () {

	}
	public void buscarProduto ( ) {
		
	}
	public void alterarDadosProduto ( ) {
		
	}
	public void deletarProduto ( ) {
		
	}
}
