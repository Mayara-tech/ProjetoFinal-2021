package Dados;

import Brinquedos.DadoBrinquedo;

public class Venda {
// Atributos
	
	private String dataVenda;
	private String FormaPagamento;
	private Float valorTotal;
	private boolean vendaOnline;
	private Vendedor vendedor;
	private Cliente cliente;
	private DadoBrinquedo brinquedos;
	private LocalRetirada localRetirada;
	
	
// Métodos Especiais (construtor):

	public Venda(String dataVenda, String formaPagamento, Float valorTotal, boolean vendaOnline, Vendedor vendedor,
		Cliente cliente, DadoBrinquedo brinquedos, LocalRetirada localRetirada) {
		this.dataVenda = dataVenda;
		this.FormaPagamento = formaPagamento;
		this.valorTotal = valorTotal;
		this.vendaOnline = vendaOnline;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.brinquedos = brinquedos;
		this.localRetirada = localRetirada;
}
// Métodos Acessores: 
	
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getFormaPagamento() {
		return FormaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		FormaPagamento = formaPagamento;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isVendaOnline() {
		return vendaOnline;
	}

	public void setVendaOnline(boolean vendaOnline) {
		this.vendaOnline = vendaOnline;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public DadoBrinquedo getBrinquedos() {
		return brinquedos;
	}

	public void setBrinquedos(DadoBrinquedo brinquedos) {
		this.brinquedos = brinquedos;
	}

	public LocalRetirada getLocalRetirada() {
		return localRetirada;
	}

	public void setLocalRetirada(LocalRetirada localRetirada) {
		this.localRetirada = localRetirada;
	}
	
// Métodos Personalizados:

	public void cadastrarVenda ( ) {
		
	}
	public void buscarVenda ( ) {
		
	}
}
