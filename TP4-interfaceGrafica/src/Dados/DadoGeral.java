package Dados;
import Brinquedos.*;


public class DadoGeral {

// Criando Listas 

	private  Cliente[] cliente = new Cliente[150];
	private int quantCliente = 0;
	private Endereco [] endereco = new Endereco[150];
	private int quantEndereco = 0;
	private  LocalRetirada[] localRetirada = new LocalRetirada[150];
	private int quantLocalRetirada = 0;
	private LojaFisica[] lojaFisica = new LojaFisica[150];
	private int quantLojaFisica = 0;
	private Telefone[] telefone = new Telefone[150];
	private int quantTelefone = 0;
	private Venda[] venda = new Venda[150];
	private int quantVenda = 0;
	private Vendedor[] vendedor= new Vendedor[150];
	private int quantVendedor= 0;
	private DadoBrinquedo[] brinquedo= new DadoBrinquedo[150];
	private int quantBrinquedo= 0;


// Criando Dados Pré Cadastrados

	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			cliente[i] = new Cliente("Nome"+i,(i+1)*12878956,(i+1)*123456, endereco[i], telefone[i], "Email"+i, "Data de nascimento"+i);
			telefone[i] = new Telefone((i+1)*100, (i+1)*1000000);
			vendedor[i] = new Vendedor("Professor"+i, (i+1)*1000, (i+1)*654321, 
					endereco[i], telefone[i], "codigo da loja"+i, "dataContratacao"+i,"cargo"+i);
			localRetirada[i] = new LocalRetirada("codigo da loja fisica"+1, endereco[i]);
			lojaFisica[i] = new LojaFisica("horário de funcionamento"+1, (i+1)*654321, (i+1)*654321, endereco[i], vendedor[i], venda[i], localRetirada[i]);
			venda[i] = new Venda("data da venda"+i, "forma de pagamento"+i, 99f, true, vendedor[i], cliente[i], brinquedo [i], localRetirada[i]);
			brinquedo[i] = new DadoBrinquedo( "Nome do brinquedo"+i, "especificacao"+i, 99f, "descrição"+i);

		}
// Definindo Quantidade de Dados Pré Cadastrados 

		quantCliente = 5;
		quantEndereco = 5;
		quantLocalRetirada = 5;
		quantLojaFisica = 5;
		quantTelefone = 5;
		quantVenda = 5;
		quantVendedor= 5;
		quantBrinquedo= 5;
	}

// Métodos Acessores


	public Cliente[] getCliente() {
		return cliente;
	}


	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}


	public int getQuantCliente() {
		return quantCliente;
	}


	public void setQuantCliente(int quantCliente) {
		this.quantCliente = quantCliente;
	}


	public Endereco[] getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco[] endereco) {
		this.endereco = endereco;
	}


	public int getQuantEndereco() {
		return quantEndereco;
	}


	public void setQuantEndereco(int quantEndereco) {
		this.quantEndereco = quantEndereco;
	}


	public LocalRetirada[] getLocalRetirada() {
		return localRetirada;
	}


	public void setLocalRetirada(LocalRetirada[] localRetirada) {
		this.localRetirada = localRetirada;
	}


	public int getQuantLocalRetirada() {
		return quantLocalRetirada;
	}


	public void setQuantLocalRetirada(int quantLocalRetirada) {
		this.quantLocalRetirada = quantLocalRetirada;
	}


	public LojaFisica[] getLojaFisica() {
		return lojaFisica;
	}


	public void setLojaFisica(LojaFisica[] lojaFisica) {
		this.lojaFisica = lojaFisica;
	}


	public int getQuantLojaFisica() {
		return quantLojaFisica;
	}


	public void setQuantLojaFisica(int quantLojaFisica) {
		this.quantLojaFisica = quantLojaFisica;
	}


	public Telefone[] getTelefone() {
		return telefone;
	}


	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}


	public int getQuantTelefone() {
		return quantTelefone;
	}


	public void setQuantTelefone(int quantTelefone) {
		this.quantTelefone = quantTelefone;
	}


	public Venda[] getVenda() {
		return venda;
	}


	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}


	public int getQuantVenda() {
		return quantVenda;
	}


	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}


	public Vendedor[] getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor[] vendedor) {
		this.vendedor = vendedor;
	}


	public int getQuantVendedor() {
		return quantVendedor;
	}


	public void setQuantVendedor(int quantVendedor) {
		this.quantVendedor = quantVendedor;
	}


	public DadoBrinquedo[] getBrinquedo() {
		return brinquedo;
	}


	public void setBrinquedo(DadoBrinquedo[] brinquedo) {
		this.brinquedo = brinquedo;
	}


	public int getQuantBrinquedo() {
		return quantBrinquedo;
	}


	public void setQuantBrinquedo(int quantBrinquedo) {
		this.quantBrinquedo = quantBrinquedo;
	}


	public void inserirEditarCliente(Cliente cliente2, int parseInt) {
	
		
	}
	public String[] getNomeCliente() {

		return null;
	}

	public boolean inserirEditarCliente(String[] novoDado) {
		return false;
	}


	public boolean removerCliente(int posicao) {

		return false;
	}

	public String[] getNomeAluno() {
		return null;
	}
}
