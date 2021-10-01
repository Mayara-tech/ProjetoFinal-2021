package Brinquedos;

public class Boneca extends Produto {
// Atributos: 
	
	private String acessorio;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// M�todos Especiais (construtor):

	public Boneca(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String acessorio,
			int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.acessorio = acessorio;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores:
	
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
	
// M�todos Personalizados:
	
	public void cadastrarBoneca ( ) {
		
	}
	public void alterarDadosBoneca ( ) {
		
	}
	public void deletarBoneca( ) {
		
	}
	public void filtrarFaixaEt�riaBoneca ( ) {
		
	}
	public void filtrarCategoriaBoneca ( ) {
		
	}

}
