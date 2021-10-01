package Dados;

public class Vendedor extends Pessoa{
// Atributos 
	
	private String codigoLoja;
	private String dataContratacao;
	private String cargo;

	
// Métodos Especiais (construtor):
	
	public Vendedor(String nome, int numeroIdentidade, int cpf, Endereco endereco, Telefone telefone, String codigoLoja,
			String dataContratacao, String cargo) {
		super(nome, numeroIdentidade, cpf, endereco, telefone);
		this.codigoLoja = codigoLoja;
		this.dataContratacao = dataContratacao;
		this.cargo = cargo;
	}
	
// Métodos Acessores:

	public String getCodigoLoja() {
		return codigoLoja;
	}
	public void setCodigoLoja(String codigoLoja) {
		this.codigoLoja = codigoLoja;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

// Métodos Personalizados:
	
	public void cadastrarVendedor () {
		
	}
	public void buscarVendedor ( ) {
		
	}
	public void alterarDadosVendedor ( ) {
		
	}
	public void deletarVendedor ( ) {
		
	}

}
