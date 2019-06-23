package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;

public class TesteConfiguracao {

	@Test
	public void testGetMultaEqual() {
		Configuracao configuracao = new Configuracao(2.80, 2, 3, 4);
		Assert.assertEquals(2.80,configuracao.getMulta(), 0.0);
		
	}
	
	@Test
	public void testGetDiasAluno() {
		Configuracao configuracao = new Configuracao(2.80, 2, 3, 4);
		Assert.assertEquals(2,configuracao.getDiasAluno());
		
	}
	
	@Test
	public void testGetDiasProf() {
		Configuracao configuracao = new Configuracao(2.80, 2, 3, 4);
		Assert.assertEquals(3,configuracao.getDiasProf());
		
	}

	@Test
	public void testGetDiasTec() {
		Configuracao configuracao = new Configuracao(2.80, 2, 3, 4);
		Assert.assertEquals(4,configuracao.getDiasTec());
		
	}


}
