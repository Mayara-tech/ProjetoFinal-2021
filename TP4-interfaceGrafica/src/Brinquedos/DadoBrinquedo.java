package Brinquedos;

public class DadoBrinquedo {

// Criando Listas 

	private  BolaEsportiva[] bola = new BolaEsportiva[150];
	private int quantBola = 0;
	private Boneca [] boneca = new Boneca[150];
	private int quantBoneca = 0;
	private Boneco[] boneco = new Boneco[150];
	private int quantBoneco = 0;
	private BrinquedoBebe[] brinquedoBebe = new BrinquedoBebe[150];
	private int quantBrinquedoBebe = 0;
	private BrinquedoEducativo[] brinquedoEducativo = new BrinquedoEducativo[150];
	private int quantBrinquedoEducativo = 0;
	private CarrinhoeCIA[] carrinhoeCIA = new CarrinhoeCIA[150];
	private int quantCarrinhoeCIA = 0;
	private Jogo[] jogo= new Jogo[150];
	private int quantJogo= 0;


//Criando Dados Pr� Cadastrados

	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			bola[i] = new BolaEsportiva("Bola "+i,"Bola Esportiva ",29.99f, "Descri��o "+i, "Marca "+i,"Modelo "+i);
			boneca[i] = new Boneca( "Boneca "+i,"Boneca ",59.99f, "Descri��o ","acess�rio "+i,(i+1)*0,"categoria" +i);
			boneco[i] = new Boneco("Boneco "+i,"Boneco de A��o ",99.99f, "Descri��o ","material "+i,(i+1)*0,"categoria" +i );
			brinquedoBebe[i] = new BrinquedoBebe("Brinquedo de b�be "+i,"Brinquedos de 0 a 2 anos ",19.99f, "Descri��o ",
					"Marca "+1, "desenvolvimento Atipico"+i,0,"categoria"+1);
			brinquedoEducativo[i] = new BrinquedoEducativo("Brinquedos Educativos "+i,"Brinquedos Educativos ",19.99f, 
					"Descri��o ", "desenvolvimento Atipico"+i,(i+1)*0,"categoria"+1);
			carrinhoeCIA[i] = new CarrinhoeCIA("Carrinhos e CIA "+i,"Carrinhos ",59.99f, "Descri��o "," interatividade"+i,
					"fun��es"+1,(i+1)*0,"categoria"+1);
			jogo[i] = new Jogo ( "Jogos "+i,"Jogos",19.99f, "Descri��o ", "Tipo"+i, "G�nero"+i,(i+1)*0,"categoria"+1);

		}
// Definindo Quantidade de Dados Pr� Cadastrados 

		quantBola = 10;
		quantBoneca = 10;
		quantBoneco = 10;
		quantBrinquedoBebe = 10;
		quantBrinquedoEducativo = 10;
		quantCarrinhoeCIA = 10;
		quantJogo= 10;
	}


// M�todos especiais 

	public DadoBrinquedo(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao) {
		super();

	}
//  M�todos Acessores	


	public DadoBrinquedo(Object nomeProduto, Object especifica��oBrinquedo, Object preco, Object descricao) {
	}


	public BolaEsportiva[] getBola() {
		return bola;
	}


	public void setBola(BolaEsportiva[] bola) {
		this.bola = bola;
	}


	public int getQuantBola() {
		return quantBola;
	}


	public void setQuantBola(int quantBola) {
		this.quantBola = quantBola;
	}


	public Boneca[] getBoneca() {
		return boneca;
	}


	public void setBoneca(Boneca[] boneca) {
		this.boneca = boneca;
	}


	public int getQuantBoneca() {
		return quantBoneca;
	}


	public void setQuantBoneca(int quantBoneca) {
		this.quantBoneca = quantBoneca;
	}


	public Boneco[] getBoneco() {
		return boneco;
	}


	public void setBoneco(Boneco[] boneco) {
		this.boneco = boneco;
	}


	public int getQuantBoneco() {
		return quantBoneco;
	}


	public void setQuantBoneco(int quantBoneco) {
		this.quantBoneco = quantBoneco;
	}


	public BrinquedoBebe[] getBrinquedoBebe() {
		return brinquedoBebe;
	}


	public void setBrinquedoBebe(BrinquedoBebe[] brinquedoBebe) {
		this.brinquedoBebe = brinquedoBebe;
	}


	public int getQuantBrinquedoBebe() {
		return quantBrinquedoBebe;
	}


	public void setQuantBrinquedoBebe(int quantBrinquedoBebe) {
		this.quantBrinquedoBebe = quantBrinquedoBebe;
	}


	public BrinquedoEducativo[] getBrinquedoEducativo() {
		return brinquedoEducativo;
	}


	public void setBrinquedoEducativo(BrinquedoEducativo[] brinquedoEducativo) {
		this.brinquedoEducativo = brinquedoEducativo;
	}


	public int getQuantBrinquedoEducativo() {
		return quantBrinquedoEducativo;
	}


	public void setQuantBrinquedoEducativo(int quantBrinquedoEducativo) {
		this.quantBrinquedoEducativo = quantBrinquedoEducativo;
	}


	public CarrinhoeCIA[] getCarrinhoeCIA() {
		return carrinhoeCIA;
	}


	public void setCarrinhoeCIA(CarrinhoeCIA[] carrinhoeCIA) {
		this.carrinhoeCIA = carrinhoeCIA;
	}


	public int getQuantCarrinhoeCIA() {
		return quantCarrinhoeCIA;
	}


	public void setQuantCarrinhoeCIA(int quantCarrinhoeCIA) {
		this.quantCarrinhoeCIA = quantCarrinhoeCIA;
	}


	public Jogo[] getJogo() {
		return jogo;
	}


	public void setJogo(Jogo[] jogo) {
		this.jogo = jogo;
	}


	public int getQuantJogo() {
		return quantJogo;
	}


	public void setQuantJogo(int quantJogo) {
		this.quantJogo = quantJogo;
	}


	public String getNomeBrinquedo() {
		return null;
	}


	public String deletarBrinquedo() {
		return null;
	}



}
