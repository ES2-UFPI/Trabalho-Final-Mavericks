package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import main.Configuracao;
import main.Emprestimo;
import main.Livro;
import main.Locatario;
import main.Main;

public class TesteCalculaMulta {

	@Test
	public void CalculaMultaNoPrazo() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
	
		Main.configuracao = new Configuracao(50,7 ,7,7);
		
	
		
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		hj.set(Calendar.DAY_OF_MONTH, 3);
		hj.set(Calendar.MONTH, 1);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 3);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 4);
		dataDev.set(Calendar.MONTH, 1);
		dataDev.set(Calendar.YEAR, 2019);
		Emprestimo em = new Emprestimo(exemplar, locatario, dataEmp, dataDev);
		Assert.assertEquals((0), Main.calculaMulta(em, hj), 0.0);
		
	}
	
	@Test
	public void CalculaMultaForaDoPrazo() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
	
		Main.configuracao = new Configuracao(50,7 ,7,7);
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		int dias = 4;
		hj.set(Calendar.DAY_OF_MONTH, 13);
		hj.set(Calendar.MONTH, 1);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 3);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 10);
		dataDev.set(Calendar.MONTH, 1);
		dataDev.set(Calendar.YEAR, 2019);
		Emprestimo em = new Emprestimo(exemplar, locatario, dataEmp, dataDev);
		Assert.assertEquals((150), Main.calculaMulta(em, hj), 0.0);
		
	}
	
	@Test
	public void CalculaMultaNoDoPrazoOutroMes() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
	
		Main.configuracao = new Configuracao(50,7 ,7,7);
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		int dias = 4;
		hj.set(Calendar.DAY_OF_MONTH, 1);
		hj.set(Calendar.MONTH, 2);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 30);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 6);
		dataDev.set(Calendar.MONTH, 2);
		dataDev.set(Calendar.YEAR, 2019);
		Emprestimo em = new Emprestimo(exemplar, locatario, dataEmp, dataDev);
		Assert.assertEquals((0 ), Main.calculaMulta(em, hj), 0.0);
		
	}
	
	@Test
	public void CalculaMultaForaD0PrazoOutroMes() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
	
		Main.configuracao = new Configuracao(2.50,7 ,7,7);
		Calendar dataDev = Calendar.getInstance();
		Calendar dataEmp = Calendar.getInstance();
		Calendar hj = Calendar.getInstance();
		int dias = 4;
		hj.set(Calendar.DAY_OF_MONTH, 8);
		hj.set(Calendar.MONTH, 2);
		hj.set(Calendar.YEAR, 2019);
		dataEmp.set(Calendar.DAY_OF_MONTH, 30);
		dataEmp.set(Calendar.MONTH, 1);
		dataEmp.set(Calendar.YEAR, 2019);
		dataDev.set(Calendar.DAY_OF_MONTH, 6);
		dataDev.set(Calendar.MONTH, 2);
		dataDev.set(Calendar.YEAR, 2019);
		Emprestimo em = new Emprestimo(exemplar, locatario, dataEmp, dataDev);
		Assert.assertEquals((5), Main.calculaMulta(em, hj), 0.0);
		
	}

}
