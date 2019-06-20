package main;

public class Livro extends Exemplar
{
	private int volume;
	private int paginas;
	
	public Livro (int codigo, int quantidade, String titulo, String autor, int volume, int paginas)
	{
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.titulo = titulo;
		this.autor = autor;
		this.volume = volume;
		this.paginas = paginas;
	}
	
	public int getVolume ()
	{
		return volume;
	}
	
	public int getPaginas ()
	{
		return paginas;
	}
	
	public void setVolume (int novoVolume)
	{
		volume = novoVolume;
	}
	
	public void setPaginas (int novaPaginas)
	{
		paginas = novaPaginas;
	}
}
