package playStore.entidades;

public abstract class Especificacao {
	protected String so;
	protected String processador;
	protected String armazenamento;
	protected String memoriaRAM;
	protected String camera;
	protected String tela;
	
	
	
	//métodos construtor
	public Especificacao(String so, String processador, String armazenamento, String memoriaRAM, String camera, String tela) {
		this.so = so;
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.memoriaRAM = memoriaRAM;
		this.camera = camera;
		this.tela = tela;
	}
	//sobrecarga do método construtor para as especificações para o aplicativo
	public Especificacao(String so, String processador, String armazenamento, String memoriaRAM) {
		this.so = so;
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.memoriaRAM = memoriaRAM;
	}
		
	//getters e setters
	public String getCamera() {
		return camera;
	}
	
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	public String getTela() {
		return tela;
	}
	
	public void setTela(String tela) {
		this.tela = tela;
	}
	
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
	//método abstrato
	public abstract void listarEspecificacoes();
}