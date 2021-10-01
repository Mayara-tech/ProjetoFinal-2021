package Brinquedos;

public class Boneca extends Produto {
// Atributos: 
	
	private String acessorio;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// Métodos Especiais (construtor):

	public Boneca(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao, String acessorio,
			int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.acessorio = acessorio;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores:
	
	public String getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
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
	
	public void cadastrarBoneca ( ) {
		
	}
	public void alterarDadosBoneca ( ) {
		
	}
	public void deletarBoneca( ) {
		
	}
	public void filtrarFaixaEtáriaBoneca ( ) {
		
	}
	public void filtrarCategoriaBoneca ( ) {
		
	}

}
