package aula11;

public abstract class Pessoa {//Classe abstrata - Apenas progenitora que não pode gerar objetos
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Métodos
	public void fazerAniversario() {
		this.idade++;
	}
	
	//Acessores e Modificadores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
