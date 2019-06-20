package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TesteCadastroLocatario {

	@Test
	public void cadastrarLocatario() {

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

	}

}
