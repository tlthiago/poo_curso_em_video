package aula10;

public class Funcionario extends Pessoa{
	//Atributos
	private String setor;
	private boolean trabalhando = true;
	
	//Métodos
	public void mudaTrabalho() {
		this.trabalhando = !this.trabalhando;
	}
	
	//Acessores e Modificadores
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
