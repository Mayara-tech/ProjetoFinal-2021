package Brinquedos;

public class BrinquedoEducativo extends Produto{
// Atributos
	
	private String desenvolvimentoAtipico;
	private int faixaEtariaRecomendada;
	private String categoria;

	
// Métodos Especiais (construtor):
	
	public BrinquedoEducativo(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao,
		String desenvolvimentoAtipico, int faixaEtariaRecomendada, String categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores:

	public String getDesenvolvimentoAtipico() {
		return desenvolvimentoAtipico;
	}
	public void setDesenvolvimentoAtipico(String desenvolvimentoAtipico) {
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
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
	
	public void cadastrarBrinquedoEducativo ( ) {
				
	}
	public void alterarDadosBrinquedoEducativo ( ) {
				
	}
	public void deletarBrinquedoEducativo( ) {
				
	}
	public void filtrarFaixaEtáriaBrinquedoEducativo ( ) {
				
	}
	public void filtrarCategoriaBrinquedoEducativo ( ) {
			
	}
}
