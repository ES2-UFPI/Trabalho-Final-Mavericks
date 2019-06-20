package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;

public class TesteConfiguracao {

	@SuppressWarnings("deprecation")
	@Test
	public void tesGetMultaEqual() {
		Configuracao configuracao = new Configuracao(2.80, 3);
		Assert.assertEquals(2.80,configuracao.getMulta(), 0.0);
		
	}
	
	@Test
	public void tesGetDiasEqual() {
		Configuracao configuracao = new Configuracao(2.80, 3);
		Assert.assertEquals(3,configuracao.getDias(), 0.0);
		
	}

}
