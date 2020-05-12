package playStore.entidades;

import java.util.ArrayList;

public class Celular extends Especificacao{
	private String nome;
	public ArrayList<Celular> modelos;
	
	//método construtor da classe
	public Celular(String nome,String so,String camera,String tela,String processador,String armazenamento,String memoriaRAM) {
		super(so,processador,armazenamento,memoriaRAM,camera,tela);
		this.nome = nome;
		modelos = new ArrayList<Celular>();
	}
		
	//métodos getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Celular> getModelos() {
		return modelos;
	}

	public void setModelos(ArrayList<Celular> modelos) {
		this.modelos = modelos;
	}
	
	//método abstrato
	@Override
	public void listarEspecificacoes() {
		System.out.println("\n-- Especificações do celular : --\n");
		System.out.println("\nSistema Operacional : "+this.so); 
		System.out.println("\nProcessador : "+this.processador);
		System.out.println("\nArmazenamento : "+this.armazenamento);
		System.out.println("\nMemória RAM : "+this.memoriaRAM);
		System.out.println("\nDados sobre a câmera : "+this.camera);
		System.out.println("\nDados sobre a tela : "+this.tela);
	}
}
