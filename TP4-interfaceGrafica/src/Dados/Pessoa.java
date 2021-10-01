package Dados;

public abstract class Pessoa {
	private String nome;
	private int numeroIdentidade;
	private int cpf;
	private Endereco endereco;
	private Telefone telefone;
	
// Métodos especiais (construtor):
	
	public Pessoa(String nome, int numeroIdentidade, int cpf, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.numeroIdentidade = numeroIdentidade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
// Métodos acessores :

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroIdentidade() {
		return numeroIdentidade;
	}
	public void setNumeroIdentidade(int numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
// Métodos personalizados
	
    public void cadastrarPessoa () {
		
	}
	public void alterarDadosPessoa ( ) {
		
	}
	public void deletarPessoa ( ) {
		
	}

}
