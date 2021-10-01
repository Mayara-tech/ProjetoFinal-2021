package Dados;

public class Cliente extends Pessoa  {
// Atributos 

	private String email;
	private String dataNascimento;
	

// Métodos Especiais (construtor):
	
	public Cliente(String nome, int numeroIdentidade, int cpf, Endereco endereco, Telefone telefone, String email,
			String dataNascimento) {
		super(nome, numeroIdentidade, cpf, endereco, telefone);
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	// Métodos Acessores:

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


// Métodos Personalizados:
	

	public void buscarCliente ( ) {

		
	}
	public void alterarDadosCliente ( ) {

	}
	public String deletarCliente ( ) {
		return deletarCliente();

	}

}
