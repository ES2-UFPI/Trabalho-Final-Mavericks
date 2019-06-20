package main;

public class Locatario {

	int matricula;
	String nome;
	String categoria;
	String senha;

	public Locatario(String nome, String categoria, String senha, int matricula) {
		this.nome = nome;
		this.categoria =  categoria;
		this.senha = senha;
		this.matricula = matricula;

	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
