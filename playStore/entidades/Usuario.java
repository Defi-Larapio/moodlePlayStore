package playStore.entidades;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private String sobrenome;	
	private String dataNascimento;
	private String email;
	private String senha;
	private String telefone;
	private int numeroModelo;
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	//método construtor da classe
	public Usuario(String nome, String sobrenome, String dataNascimento, String email, String senha, String telefone , int numeroModelo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.numeroModelo = numeroModelo;
		this.usuarios = new ArrayList<>();
	}
	
	//sobrecarga do método construtor caso não querer adicionar um telefone
	public Usuario(String nome, String sobrenome, String dataNascimento, String email, String senha, int numeroModelo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.numeroModelo = numeroModelo;
	}
	
	//funções da classe
	public void mostrarDadosUsuario() {
		System.out.println("Nome : "+this.nome);
		System.out.println("Sobrenome : "+this.sobrenome);
		System.out.println("Data de nascimento : "+this.dataNascimento);
		System.out.println("Email : "+this.email);
		System.out.println("Senha : "+this.senha);
		System.out.println("Telefone : "+this.telefone);
	}
	
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

	public int getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(int numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
