package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Artigo;
import main.Livro;
import main.Main;

public class TesteExemplar 
{
	@Test
	public void cadastrarExemplar ()
	{
		System.out.println("Teste cadastrar exemplar");
		
		Main.cadastrarExemplar("Computacao", "Lucas", 1, 10, 2);
		assertEquals(Main.exemplares.get(0) instanceof Livro, true);
		assertEquals(Main.exemplares.get(0).getTitulo(), "Computacao");
		assertEquals(Main.exemplares.get(0).getAutor(), "Lucas");
		assertEquals(((Livro)Main.exemplares.get(0)).getVolume(), 1);
		assertEquals(((Livro)Main.exemplares.get(0)).getPaginas(), 10);
		assertEquals(Main.exemplares.get(0).getQuantidade(), 2);
		
		Main.cadastrarExemplar("Libras", "Joao", "Cultura", 1);
		assertEquals(Main.exemplares.get(1) instanceof Artigo, true);
		assertEquals(Main.exemplares.get(1).getTitulo(), "Libras");
		assertEquals(Main.exemplares.get(1).getAutor(), "Joao");
		assertEquals(((Artigo)Main.exemplares.get(1)).getRevista(), "Cultura");
		assertEquals(Main.exemplares.get(1).getQuantidade(), 1);
		
		System.out.println("Teste cadastrar exemplares iguais");
		Main.cadastrarExemplar("Computacao", "Lucas", 1, 10, 2);
		assertEquals(Main.exemplares.size(), 2);
		assertEquals(Main.exemplares.get(0).getQuantidade(), 4);
		
		Main.cadastrarExemplar("Libras", "Joao", "Cultura", 1);
		assertEquals(Main.exemplares.size(), 2);
		assertEquals(Main.exemplares.get(1).getQuantidade(), 2);
	}
}
