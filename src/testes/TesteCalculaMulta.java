package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import main.Main;

public class TesteCalculaMulta {

	@Test
	public void CalculaMultaNoPrazo() {
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		hj.set(Calendar.DAY_OF_MONTH, 4);
		hj.set(Calendar.MONTH, 1);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 3);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 4);
		dataDev.set(Calendar.MONTH, 1);
		dataDev.set(Calendar.YEAR, 2019);
		Main.cadastrarConfiguracao(2.80, 2, 3, 4);
		Assert.assertEquals((0), Main.calculaMulta(3, dataDev, dataEmp, hj), 0.0);
		
	}
	
	
	
	@Test
	public void CalculaMultaForaDoPrazo() {
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		int dias = 2;
		hj.set(Calendar.DAY_OF_MONTH, 7);
		hj.set(Calendar.MONTH, 1);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 3);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 5);
		dataDev.set(Calendar.MONTH, 1);
		dataDev.set(Calendar.YEAR, 2019);
		Main.cadastrarConfiguracao(1, 2, 3, 4);
		Assert.assertEquals((2), Main.calculaMulta(Main.configuracao.getDiasAluno(), dataDev, dataEmp, hj), 0.0);
		
	}
	
	public void CalculaMultaMesDiferente() {
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		int dias = 2;
		hj.set(Calendar.DAY_OF_MONTH, 7);
		hj.set(Calendar.MONTH, 3);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 3);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 5);
		dataDev.set(Calendar.MONTH, 1);
		dataDev.set(Calendar.YEAR, 2019);
		Main.cadastrarConfiguracao(1, 2, 3, 4);
		Assert.assertEquals((60), Main.calculaMulta(Main.configuracao.getDiasAluno(), dataDev, dataEmp, hj), 0.0);
		
	}
	
	
	
	
	
	
	

}
