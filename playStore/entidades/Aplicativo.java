package playStore.entidades;

import java.util.ArrayList;

public class Aplicativo extends Especificacao{
	private String nome;
	private String descricao;
	private String icone;
	ArrayList<Aplicativo> aplicativos = new ArrayList<Aplicativo>();
	
	//método construtor da classe
	public Aplicativo(String nome, String so, String processador, String armazenamento, String memoriaRAM,String descricao, String icone) {
		super(so,processador,armazenamento,memoriaRAM);
		this.nome = nome;
		this.descricao = descricao;
		this.icone = icone;
	}
		
	//sobrecarga do método construtor 
	//para caso não quiser escrever uma descrição
	public Aplicativo(String nome, String so, String processador, String armazenamento, String memoriaRAM, String icone) {
		super(so,processador,armazenamento,memoriaRAM);
		this.nome = nome;
		this.icone = icone;
	}
	
	//pré definição de alguns icones pra servirem de modelo
	static String icone1 = 
						   "──▒▒▒▒▒▒───▄████▄\r\n" + 
			        	   "─▒─▄▒─▄▒──███▄█▀\r\n" + 
			        	   "─▒▒▒▒▒▒▒─▐████──█─█\r\n" + 
			        	   "─▒▒▒▒▒▒▒──█████▄\r\n" + 
			        	   "─▒─▒─▒─▒───▀████▀\r\n" + 
			        	   "\n";
			
	
	static String icone2 = 
						   "░▐█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▄☆\r\n" + 
						   "░███████████████████████\r\n" + 
						   "░▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓◤\r\n" + 
						   "╬▀░▐▓▓▓▓▓▓▌▀█░░░█▀░\r\n" + 
						   "▒░░▓▓▓▓▓▓█▄▄▄▄▄█▀╬░\r\n" + 
						   "░░█▓▓▓▓▓▌░▒▒▒▒▒▒▒▒▒\r\n" + 
						   "░▐██████▌╬░▒▒▒▒▒▒▒▒\r\n" + 
						   "\n";
	static String icone3 = 
						  "░░░░░░███████ ]▄▄▄▄▄▄▄▄\r\n" + 
				   		  "▂▄▅█████████▅▄▃▂\r\n" + 
				   		  "I███████████████████].\r\n" + 
				   		  "◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤...\r\n" + 
				   		  "\n";
	static String icone4 =  
						   "──▀▀▀▀▀▀▀▀▀▀▀▄▄▀▀▀▀▀▀▀▀▀▀▀\r\n" + 
					 	   "────────────█▀▀█\r\n" + 
					 	   "───────────█▓▓▓▓█\r\n" + 
					 	   "───────══▄▀█▓▓▓▓█▀▄══\r\n" + 
					 	   "──▄▄▄▄▄▄▄█▒█▓▓▓▓█▒█▄▄▄▄▄▄▄\r\n" + 
					 	   "──█▀▀▀▀█▀███▄▓▓▄███▀█▀▀▀▀█\r\n" + 
					 	   "─▄█▄──▄█▄───▀██▀───▄█▄──▄█▄\r\n" + 
					 	   "─█▒█──█▒█──────────█▒█──█▒█\r\n" + 
					 	   "─▀▀▀──▀▀▀──────────▀▀▀──▀▀▀\r\n" + 
					 	   "\n";
	static String icone5 = 
					       "╔══╗ \r\n" + 
						   "║██║ \r\n" + 
						   "║()║♫ ♪ ♫ ♪\r\n" + 
						   "╚══╝\r\n" + 
						   "▄ █ ▄ █ ▄ ▄ █ ▄ █ ▄ █\r\n" + 
						   "Min- - - - - - - - - - - -●Max\r\n" + 
						   "\n";

	//métodos getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static String getIcone1() {
		return icone1;
	}

	public static String getIcone2() {
		return icone2;
	}
	
	public static String getIcone3() {
		return icone3;
	}

	public static String getIcone4() {
		return icone4;
	}
	
	public static String getIcone5() {
		return icone5;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricaoApp) {
		descricao = descricaoApp;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String iconeApp) {
		icone = iconeApp;
	}
	
	//método abstrato
	@Override
	public void listarEspecificacoes() {
			System.out.println("\n-- Especificações do aplicativo : --\n");
			System.out.println("\nSistema Operacional : no mínimo "+this.so); 
			System.out.println("\nProcessador : no mínimo um "+this.processador);
			System.out.println("\nMemória RAM : no mínimo "+this.memoriaRAM);
	}
	
}