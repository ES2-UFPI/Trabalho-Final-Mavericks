package testes;

import org.junit.Test;

public class TesteGeral {

	TesteLocatario testLocatario = new TesteLocatario();
	TesteExemplar testeExemplar = new TesteExemplar();
	TesteAlterarConfiguracao testeAlterarConfig = new TesteAlterarConfiguracao();
	TesteCadastroConfiguracao testeCadastroConfig = new TesteCadastroConfiguracao();
	TesteCalculaMulta testeCalculaMulta = new TesteCalculaMulta();
	TesteConfiguracao testeConfiguracao = new TesteConfiguracao();


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
	
	@Test
	public void testeConfi(){
		testeConfiguracao.testGetDiasAluno();
		testeConfiguracao.testGetDiasTec();
		testeConfiguracao.testGetDiasProf();
		testeConfiguracao.testGetMultaEqual();
	}
	
	@Test
	public void testeAlterarConfiguracao(){
		testeAlterarConfig.testAlterarConfigDiaAluno();
		testeAlterarConfig.testAlterarConfigDiaProf();
		testeAlterarConfig.testAlterarConfigDiaTec();
		testeAlterarConfig.testAlterarConfigMulta();
	}
	
	@Test
	public void testeCadastrarConfig(){
		testeCadastroConfig.testaCadastroConfig();
	}
	
	@Test
	public void testeCalcularMulta(){
		testeCalculaMulta.CalculaMultaForaDoPrazo();
		testeCalculaMulta.CalculaMultaNoPrazo();
	}
}
