package Dados;

public class Endereco {
	
// Atributos 
	
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String complementoEndereco;
	private int cep;
	private int quadra;
	private int lote;
	
// Métodos Especiais (construtor):
	
	public Endereco(String pais, String estado, String cidade, String bairro, String rua, String complementoEndereco,
			int cep, int quadra, int lote) {
		this.setPaís(pais);
		this.setEstado(estado);
		this.setCidade(cidade);
		this.setBairro(bairro);
		this.setRua(rua);
		this.setComplementoEndereco(complementoEndereco);
		this.setCep(cep);
		this.setQuadra(quadra);
		this.setLote(lote);
	}
// Métodos Acessores: 
	

	public Endereco(int parseInt, Telefone telefone) {
	}

	public String getPaís() {
		return pais;
	}
	public void setPaís(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getQuadra() {
		return quadra;
	}
	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	
// Métodos Personalizados:
	
	public void cadastrarEndereco () {
		
	}
	public void alterarDadosEndereco ( ) {
		
	}
	public void deletarEndereco ( ) {
		
	}

}
