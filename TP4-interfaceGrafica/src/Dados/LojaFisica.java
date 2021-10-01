package Dados;

public class LojaFisica {
// Atributos 
	
	private String horarioFuncionamento;
	private int codigoLoja;
	private int quantidadeEstoque;
	private Endereco endereco;
	private Vendedor vendedor;
	private Venda venda;
	private LocalRetirada localRetirada;
	
	
// Métodos Especiais (construtor):
	
	public LojaFisica(String horarioFuncionamento, int codigoLoja, int quantidadeEstoque, Endereco endereco,
		Vendedor vendedor, Venda venda, LocalRetirada localRetirada) {
		this.horarioFuncionamento = horarioFuncionamento;
		this.codigoLoja = codigoLoja;
		this.quantidadeEstoque = quantidadeEstoque;
		this.endereco = endereco;
		this.vendedor = vendedor;
		this.venda = venda;
		this.localRetirada = localRetirada;
}

// Métodos Acessores:

	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public int getCodigoLoja() {
		return codigoLoja;
	}

	public void setCodigoLoja(int codigoLoja) {
		this.codigoLoja = codigoLoja;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public LocalRetirada getLocalRetirada() {
		return localRetirada;
	}

	public void setLocalRetirada(LocalRetirada localRetirada) {
		this.localRetirada = localRetirada;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
// Métodos Personalizados:
	
	public void cadastrarLojaFisica () {
		
	}
	public void filtrarLojaFisica ( ) {
		
	}
	public void alterarDadosEstadoLojaFisica ( ) {
		
	}
	public void deletarLojaFisica ( ) {
		
	}
}
