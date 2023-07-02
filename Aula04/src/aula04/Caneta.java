package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, String c, float p) { //Método construtor
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo() { //Método acessor
		return this.modelo;
	}
	
	public void setModelo(String m) { //Método modificador
		this.modelo = m;
	}
	
	public float getPonta() { //Método acessor
		return this.ponta;
	}
	
	public void setPonta(float p) { //Método modificador
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a Caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
