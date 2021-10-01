package Dados;

public class Telefone {
// Atributos
	
	private int ddd;
	private int numeroTelefone;

// Métodos Especiais (construtor):
	
	public Telefone(int ddd, int numeroTelefone) {
		this.setDdd(ddd);
		this.setNumeroTelefone(numeroTelefone);
	}
// Métodos Acessores:
	
	public Telefone(int parseInt, String string, String string2) {
	}

	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
// Métodos Personalizados;
	
	public void cadastrarTelefone () {
		
	}
	public void alterarDadosTelefone ( ) {
		
	}
	public void deletarTelefone ( ) {
		
	}
}
