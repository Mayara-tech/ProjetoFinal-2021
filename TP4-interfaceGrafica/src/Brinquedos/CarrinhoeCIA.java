package Brinquedos;

public class CarrinhoeCIA extends Produto{
// Atributos
	
	private String interatividade;
	private String fun��es;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// M�todos Especiais:

	public CarrinhoeCIA(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao,
		String interatividade, String fun��es, int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.interatividade = interatividade;
		this.fun��es = fun��es;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores (construtor):
	
	public String getInteratividade() {
		return interatividade;
	}
	public void setInteratividade(String interatividade) {
		this.interatividade = interatividade;
	}
	public String getFun��es() {
		return fun��es;
	}
	public void setFun��es(String fun��es) {
		this.fun��es = fun��es;
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

// M�todos Personalizados:
	
	public void cadastrarCarrinhoeCIA ( ) {
			
	}
	public void alterarDadosCarrinhoeCIA ( ) {
			
	}
	public void deletarCarrinhoeCIA( ) {
			
	}
	public void filtrarFaixaEt�riaCarrinhoeCIA ( ) {
			
	}
	public void filtrarCategoriaCarrinhoeCIA ( ) {
			
	}
}
