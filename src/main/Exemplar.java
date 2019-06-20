package main;

public abstract class Exemplar 
{
	protected int codigo;
	protected int quantidade;
	protected String titulo;
	protected String autor;
	protected boolean alocado = false;
	
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
	
	public boolean isAlocado ()
	{
		return alocado;
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
	
	public void setAlocado (boolean newAlocado)
	{
		alocado = newAlocado;
	}
}
