package Brinquedos;

public class Jogo extends Produto {
// Atributos
	
	private String tipo;
	private String genero;
	private int faixaEtariaRecomendada;
	private String categoria;
	
// M�todos Especiais (construtor):

	public Jogo(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String tipo,
		String genero, int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.tipo = tipo;
		this.genero = genero;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores: 
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
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
	
	public void cadastrarJogo ( ) {
					
	}
	public void alterarDadosJogo ( ) {
					
	}
	public void deletarJogo( ) {
					
	}
	public void filtrarFaixaEt�riaJogo ( ) {
					
	}
	public void filtrarCategoriaJogo ( ) {
				
	}
}
