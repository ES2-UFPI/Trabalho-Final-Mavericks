package main;

public class Exemplar 
{
	private int codigo;
	private int quantidade;
	private String titulo;
	private String autor;
	
	public Exemplar (int codigo, int quantidade, String titulo, String autor)
	{
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public int getCodigo ()
	{
		return codigo;
	}
	
	public int getQuantidade ()
	{
		return quantidade;
	}
	
	public String getTitulo ()
	{
		return titulo;
	}
	
	public String getAutorString ()
	{
		return autor;
	}
	
	public void setCodigo (int novoCodigo)
	{
		codigo = novoCodigo;
	}
	
	public void setQuantidade (int novaQuantidade)
	{
		quantidade = novaQuantidade;
	}
	
	public void setTitulo (String novoTitulo)
	{
		titulo = novoTitulo;
	}
	
	public void setAutor (String novoAutor)
	{
		autor = novoAutor;
	}
}
