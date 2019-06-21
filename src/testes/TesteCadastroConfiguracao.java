package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;
import main.Main;

public class TesteCadastroConfiguracao {

	@Test
	public void testaCadastroConfig() {
		Main.configuracao();
		Configuracao conf = new Configuracao(2.80, 2, 3, 4);
		Assert.assertEquals(conf.getMulta(), Main.configuracao.getMulta(), 0.0 );
		assertEquals(conf.getDiasAluno(), Main.configuracao.getDiasAluno());
		assertEquals(conf.getDiasProf(), Main.configuracao.getDiasProf());
		assertEquals(conf.getDiasTec(), Main.configuracao.getDiasTec());
		Assert.assertNotNull(Main.configuracao);
		Assert.assertNotNull(conf);
	}

}
