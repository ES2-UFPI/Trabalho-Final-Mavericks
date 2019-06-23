package testes;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import main.Configuracao;
import main.Emprestimo;
import main.Exemplar;
import main.Livro;
import main.Locatario;
import main.Main;

public class TesteEmprestimo {
	

	@Test
	public void testEmprestimo() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
	
		Main.configuracao = new Configuracao(50,7 ,7,7);
		
		Emprestimo em = Main.emprestimo(locatario, exemplar, atual, devolucao);
		
		
		assertEquals(exemplar,em.getExemplar());
		assertEquals(locatario,em.getLocatario());
		assertEquals(atual,em.getData_emp());
		assertEquals(devolucao,em.getData_dev());
		Main.emprestimos.remove(em);
	
	}

	@Test
	public void testBuscarLocatario() {
	    Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
		Locatario locatario2 = new Locatario("marcos", "Aluno", "123", 2);
		Main.locatarios.add(locatario);
		Main.locatarios.add(locatario2);
		assertEquals(locatario,Main.buscarLocatario(1));
		assertEquals(locatario2,Main.buscarLocatario(2));
		Main.locatarios.remove(locatario);
		Main.locatarios.remove(locatario2);
		
	}

	@Test
	public void testBuscarExemplar() {
		Exemplar exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Main.exemplares.add(exemplar);
		System.out.println(exemplar.getAutor());
		assertEquals(exemplar.getCodigo(),Main.buscarExemplar(1).getCodigo());
		Main.exemplares.remove(exemplar);
	}
	
	@Test
	public void testCalcularData() {
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
		 devolucao = Main.calcularData(atual, devolucao, locatario);
		assertEquals(atual.get(Calendar.DAY_OF_MONTH) + Main.configuracao.getDiasAluno()  , devolucao.get(Calendar.DAY_OF_MONTH)  );
	}

	@Test
	public void testRelatorio() {
		Livro exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		Calendar atual = Calendar.getInstance();
		Calendar devolucao = Calendar.getInstance();
		
		Locatario locatario = new Locatario("joao", "Aluno", "123", 1);
		Locatario locatario2 = new Locatario("marcos", "Aluno", "123", 2);
		Main.configuracao = new Configuracao(50,7 ,7,7);
		Emprestimo em = Main.emprestimo(locatario,exemplar,atual,devolucao);
		Emprestimo em2 = Main.emprestimo(locatario2,exemplar,atual,devolucao);
		devolucao = Main.calcularData(atual, devolucao, locatario);
		Main.emprestimos.add(em);
		Main.emprestimos.add(em2);
		
		ArrayList<Emprestimo> lista = (ArrayList<Emprestimo>) Main.relatorioEmprestimoGeral(0);
		assertEquals(em.getData_emp().get(Calendar.DAY_OF_MONTH), lista.get(0).getData_emp().get(Calendar.DAY_OF_MONTH));
	
		assertEquals(em2.getData_emp().get(Calendar.DAY_OF_MONTH), lista.get(1).getData_emp().get(Calendar.DAY_OF_MONTH));
		Main.emprestimos.remove(em);
		Main.emprestimos.remove(em2);
	}
	
	


	
	
	
}