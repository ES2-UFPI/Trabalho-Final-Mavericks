package main;

public class Artigo extends Exemplar
{
	private String revista;
	
	public Artigo (int codigo, int quantidade, String titulo, String autor, String revista)
	{
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.titulo = titulo;
		this.autor = autor;
		this.revista = revista;
	}
	
	public String getRevista ()
	{
		return revista;
	}
	
	public void setRevista (String novaRevista)
	{
		revista = novaRevista;
	}
}
