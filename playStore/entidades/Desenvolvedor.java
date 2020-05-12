package playStore.entidades;

public class Desenvolvedor {
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String email;
	private String senha;
	private	String telefone;
	private String numeroCartao;
	private String dataCartao;
	private String senhaCartao;
	private int numeroModelo;
	
	//método construtor da classe
	public Desenvolvedor(String nome,String sobrenome,String dataNascimento,String email,String senha,String telefone,String numeroCartao,String dataCartao,String senhaCartao,int numeroModelo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.numeroCartao = numeroCartao;
		this.dataCartao = dataCartao;
		this.senhaCartao = senhaCartao;
		this.setNumeroModelo(numeroModelo);
	}
	
	//sobrecarga do método construtor caso não querer adicionar um telefone
	public Desenvolvedor(String nome,String sobrenome,String dataNascimento,String email,String senha,String numeroCartao,String dataCartao,String senhaCartao,int numeroModelo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.numeroCartao = numeroCartao;
		this.dataCartao = dataCartao;
		this.senhaCartao = senhaCartao;
		this.setNumeroModelo(numeroModelo);
	}
	//funções da classe
	public void mostrarDadosDesenvolvedor() {
		System.out.println("Nome : "+this.nome);
		System.out.println("Sobrenome : "+this.sobrenome);
		System.out.println("Data de nascimento : "+this.dataNascimento);
		System.out.println("Email : "+this.email);
		System.out.println("Senha : "+this.senha);
		System.out.println("Telefone : "+this.telefone);
	}
	
	//métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getDataCartao() {
		return dataCartao;
	}
	public void setDataCartao(String dataCartao) {
		this.dataCartao = dataCartao;
	}
	public String getSenhaCartao() {
		return senhaCartao;
	}
	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}

	public int getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(int numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

}