package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;
import main.Main;

public class TesteAlterarConfiguracao {

	@Test
	public void testAlterarConfigMulta() {
		Main.cadastrarConfiguracao(3, 2, 3, 4);
		Configuracao conf = new Configuracao(2.80, 2, 4, 5);
		Main.alterarConfiguracaom(1, 2.80);
		Assert.assertEquals(conf.getMulta(), Main.configuracao.getMulta(), 0.0);
	}
	
	@Test
	public void testAlterarConfigDiaAluno() {
		Main.cadastrarConfiguracao(3, 2, 3, 4);
		Configuracao conf = new Configuracao(2.80, 3, 4, 5);
		Main.alterarConfiguracaod(2, 3);
		assertEquals(conf.getDiasAluno(), Main.configuracao.getDiasAluno());
	}
	
	@Test
	public void testAlterarConfigDiaProf() {
		Main.cadastrarConfiguracao(3, 2, 3, 4);
		Configuracao conf = new Configuracao(2.80, 3, 4, 5);
		Main.alterarConfiguracaod(3, 4);
		assertEquals(conf.getDiasProf(), Main.configuracao.getDiasProf());
	}

	@Test
	public void testAlterarConfigDiaTec() {
		Main.cadastrarConfiguracao(3, 2, 3, 4);
		Configuracao conf = new Configuracao(2.80, 3, 4, 5);
		Main.alterarConfiguracaod(4, 5);
		assertEquals(conf.getDiasTec(), Main.configuracao.getDiasTec());
	}

}
