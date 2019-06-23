package testes;

import org.junit.Test;

public class TesteGeral {

	TesteLocatario testLocatario = new TesteLocatario();
	TesteExemplar testeExemplar = new TesteExemplar();
	TesteAlterarConfiguracao testeAlterarConfig = new TesteAlterarConfiguracao();
	TesteCadastroConfiguracao testeCadastroConfig = new TesteCadastroConfiguracao();
	TesteCalculaMulta testeCalculaMulta = new TesteCalculaMulta();

	@Test
	public void testLocatario() {
		testLocatario.pesquisarLocatario();
		testLocatario.cadastrarLocatario();
		testeExemplar.cadastrarExemplar();
		testeAlterarConfig.testAlterarConfigDiaAluno();
		testeAlterarConfig.testAlterarConfigDiaProf();
		testeAlterarConfig.testAlterarConfigDiaTec();
		testeAlterarConfig.testAlterarConfigMulta();
		testeCadastroConfig.testaCadastroConfig();
		testeCalculaMulta.CalculaMultaForaDoPrazo();
		testeCalculaMulta.CalculaMultaNoPrazo();
	}

}
