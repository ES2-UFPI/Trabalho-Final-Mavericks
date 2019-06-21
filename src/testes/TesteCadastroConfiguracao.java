package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;
import main.Main;

public class TesteCadastroConfiguracao {

	@Test
	public void testaCadastroMulta() {
		Main.cadastrarConfiguracao(2.80, 2, 3, 4);;
		Assert.assertEquals(2.80, Main.configuracao.getMulta(), 0.0 );
		assertEquals(2, Main.configuracao.getDiasAluno());
		assertEquals(3, Main.configuracao.getDiasProf());
		assertEquals(4, Main.configuracao.getDiasTec());
		Assert.assertNotNull(Main.configuracao);
	
	}
}
