package Brinquedos;

public class Boneco extends Produto {
// Atributos
	
	private String material;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// Métodos Especiais (construtor):
	
	public Boneco(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao, String material,
			int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.material = material;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores:
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getFaixaEtariaRecomendada() {
		return faixaEtariaRecomendada;
	}
	public void setFaixaEtariaRecomendada(int faixaEtariaRecomendada) {
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

// Métodos Personalizados:
	
	public void cadastrarBoneco ( ) {
			
	}
	public void alterarDadosBoneco ( ) {
			
	}
	public void deletarBoneco( ) {
			
	}
	public void filtrarFaixaEtáriaBoneco ( ) {
			
	}
	public void filtrarCategoriaBoneco ( ) {
			
	}
}
