package testes;

import org.junit.Test;

public class TesteGeral {

	TesteLocatario testLocatario = new TesteLocatario();
	TesteExemplar testeExemplar = new TesteExemplar();


	@Test
	public void testLocatario() {
		testLocatario.pesquisarLocatario();
		testLocatario.relatorioLocatario();
		testLocatario.cadastrarLocatario();
	}
	
	@Test
	public void testExemplar ()
	{
		testeExemplar.cadastrarExemplar();
		testeExemplar.relatorioExemplar();
		testeExemplar.pesquisarExemplar();
	}
}
