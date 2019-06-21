package testes;

import org.junit.Test;

public class TesteGeral {

	TesteLocatario testLocatario = new TesteLocatario();
	TesteExemplar testeExemplar = new TesteExemplar();

	@Test
	public void testLocatario() {
		testLocatario.pesquisarLocatario();
		testLocatario.cadastrarLocatario();
		
	}

}
