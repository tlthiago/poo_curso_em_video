package aula10;

public class Aluno extends Pessoa{
	//Atributos
	private int matr;
	private String curso;
	
	//Métodos
	public void cancelarMatr() {
		System.out.println("Matrícula será cancelada.");
	}

	//Acessores e Modificadores
	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
