package Brinquedos;

public class CarrinhoeCIA extends Produto{
// Atributos
	
	private String interatividade;
	private String funções;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// Métodos Especiais:

	public CarrinhoeCIA(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao,
		String interatividade, String funções, int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.interatividade = interatividade;
		this.funções = funções;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores (construtor):
	
	public String getInteratividade() {
		return interatividade;
	}
	public void setInteratividade(String interatividade) {
		this.interatividade = interatividade;
	}
	public String getFunções() {
		return funções;
	}
	public void setFunções(String funções) {
		this.funções = funções;
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
	
	public void cadastrarCarrinhoeCIA ( ) {
			
	}
	public void alterarDadosCarrinhoeCIA ( ) {
			
	}
	public void deletarCarrinhoeCIA( ) {
			
	}
	public void filtrarFaixaEtáriaCarrinhoeCIA ( ) {
			
	}
	public void filtrarCategoriaCarrinhoeCIA ( ) {
			
	}
}
