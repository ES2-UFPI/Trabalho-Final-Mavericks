package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Artigo;
import main.Exemplar;
import main.Livro;
import main.Main;

public class TesteExemplar 
{
	@Test
	public void cadastrarExemplar ()
	{
		System.out.println("Teste cadastrar exemplar");
		
		Main.cadastrarExemplar("Computacao", "Lucas", 1, 10, 2);
		assertEquals(true, Main.exemplares.get(0) instanceof Livro);
		assertEquals("Computacao", Main.exemplares.get(0).getTitulo());
		assertEquals("Lucas", Main.exemplares.get(0).getAutor());
		assertEquals(1, ((Livro)Main.exemplares.get(0)).getVolume());
		assertEquals(10, ((Livro)Main.exemplares.get(0)).getPaginas());
		assertEquals(2, Main.exemplares.get(0).getQuantidade());
		
		Main.cadastrarExemplar("Libras", "Joao", "Cultura", 1);
		assertEquals(true, Main.exemplares.get(1) instanceof Artigo);
		assertEquals("Libras", Main.exemplares.get(1).getTitulo());
		assertEquals("Joao", Main.exemplares.get(1).getAutor());
		assertEquals("Cultura", ((Artigo)Main.exemplares.get(1)).getRevista());
		assertEquals(1, Main.exemplares.get(1).getQuantidade());
		
		System.out.println("Teste cadastrar exemplares iguais");
		Main.cadastrarExemplar("Computacao", "Lucas", 1, 10, 2);
		assertEquals(2, Main.exemplares.size());
		assertEquals(4, Main.exemplares.get(0).getQuantidade());
		
		Main.cadastrarExemplar("Libras", "Joao", "Cultura", 1);
		assertEquals(2, Main.exemplares.size());
		assertEquals(2, Main.exemplares.get(1).getQuantidade());
	}
	
	@Test
	public void pesquisarExemplar ()
	{
		System.out.println("\nTeste pesquisar exemplar");
		
		System.out.println("\nPesquisa por codigo");
		
		Exemplar e = Main.pesquisarExemplar(1);
		assertEquals(true, e instanceof Livro);
		assertEquals("Computacao", e.getTitulo());
		assertEquals("Lucas", e.getAutor());
		assertEquals(1, ((Livro)e).getVolume());
		assertEquals(10, ((Livro)e).getPaginas());
		assertEquals(4, e.getQuantidade());
		
		Exemplar e2 = Main.pesquisarExemplar(2);
		assertEquals(true, e2 instanceof Artigo);
		assertEquals("Libras", e2.getTitulo());
		assertEquals("Joao", e2.getAutor());
		assertEquals("Cultura", ((Artigo)e2).getRevista());
		assertEquals(2, e2.getQuantidade());
		
		System.out.println("\nPesquisa por atributos");
		
		Exemplar e3 = Main.pesquisarExemplar("Computacao", "Lucas", 1, 10);
		assertEquals(4, e3.getQuantidade());
		assertEquals(1, e3.getCodigo());
		
		Exemplar e4 = Main.pesquisarExemplar("Libras", "Joao", "Cultura");
		assertEquals(2, e4.getQuantidade());
		assertEquals(2, e4.getCodigo());
	}
}
