package Brinquedos;

public class BolaEsportiva extends Produto {
// Atributos
	
	private String marca;
	private String modelo;
	
// M�todos Especiais (construtor):
	
	public BolaEsportiva(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String marca,
		String modelo) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.marca = marca;
		this.modelo = modelo;
	}
// M�todos Acessores:
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
// M�todos Personalizados:
	
	public void cadastrarBola () {

	}
	public void alterarDadoBola () {
		
	}
	public void deletarBola ( ) {
		
	}
	public void filtrarModeloBola( ) {
		
	}
}
