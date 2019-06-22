package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import main.Locatario;
import main.Main;

public class TesteLocatario {

	@Test
	public void cadastrarLocatario() {

		System.out.println("Teste locatario");
		Main.cadastrarLocatario("lucas", "Aluno", "123");
		assertEquals(3, Main.matricula);
		assertEquals("lucas", Main.locatarios.get(2).getNome());
		assertEquals("Aluno", Main.locatarios.get(2).getCategoria());
		assertEquals("123", Main.locatarios.get(2).getSenha());

		Main.cadastrarLocatario("gui", "Professor", "234");
		assertEquals(4, Main.matricula);
		assertEquals("gui", Main.locatarios.get(3).getNome());
		assertEquals("Professor", Main.locatarios.get(3).getCategoria());
		assertEquals("234", Main.locatarios.get(3).getSenha());
		
		
	}
	
	@Test
	public void pesquisarLocatario() {
		
		System.out.println("Teste locatario");
		Main.cadastrarLocatario("neto", "Aluno", "123");
		assertEquals(1, Main.matricula);
		assertEquals("neto", Main.locatarios.get(0).getNome());
		assertEquals("Aluno", Main.locatarios.get(0).getCategoria());
		assertEquals("123", Main.locatarios.get(0).getSenha());

		Main.cadastrarLocatario("joao", "Professor", "234");
		assertEquals(2, Main.matricula);
		assertEquals("joao", Main.locatarios.get(1).getNome());
		assertEquals("Professor", Main.locatarios.get(1).getCategoria());
		assertEquals("234", Main.locatarios.get(1).getSenha());
		
		
		System.out.println("\nTeste pesquisar locatario");
		Locatario l = Main.pesquisarLocatario(0);
		assertEquals(0, l.getMatricula());
		assertEquals("neto", l.getNome());
		assertEquals("Aluno",l.getCategoria());
		assertEquals("123", l.getSenha());
		
	}
	
	@Test
	public void relatorioLocatario() {
		@SuppressWarnings("unchecked")
		List<Locatario> lista = Main.relatorioLocatarios();
		assertEquals("joao", lista.get(0).getNome());
		assertEquals("Professor", lista.get(0).getCategoria());
		assertEquals("234", lista.get(0).getSenha());
		
		assertEquals("neto", lista.get(1).getNome());
		assertEquals("Aluno", lista.get(1).getCategoria());
		assertEquals("123", lista.get(1).getSenha());
	}
	
	

}
