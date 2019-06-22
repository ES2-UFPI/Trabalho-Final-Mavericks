package testes;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import main.Configuracao;
import main.Emprestimo;
import main.Livro;
import main.Locatario;
import main.Main;

public class TesteEmprestimo {
	
	
   Livro exemplar ;
   Locatario locatario;
   Locatario locatario2;
   Emprestimo em;
   Emprestimo em2; 
   Calendar atual = Calendar.getInstance();
   Calendar devolucao = Calendar.getInstance();
	@Before
	public void setUp() throws Exception {
		exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		
		
		locatario = new Locatario("joao", "Aluno", "123", 1);
		
		
		locatario2 = new Locatario("marcos", "Aluno", "123", 2);
		
		
		Main.configuracao = new Configuracao(50,7 ,7,7);
		
		em = new Emprestimo(exemplar,locatario,atual,devolucao);
		em2 = new Emprestimo(exemplar,locatario2,atual,devolucao);
		Main.emprestimos.add(em);
		Main.emprestimos.add(em2);
	}

	@Test
	public void testEmprestimo() {
		
		assertEquals(exemplar,em.getExemplar());
		assertEquals(locatario,em.getLocatario());
		assertEquals(atual,em.getData_emp());
		assertEquals(devolucao,em.getData_dev());
	}

	@Test
	public void testBuscarLocatario() {
		Main.locatarios.add(locatario);
		Main.locatarios.add(locatario2);
		assertEquals(locatario,Main.buscarLocatario(1));
		assertEquals(locatario2,Main.buscarLocatario(2));
	}

	@Test
	public void testBuscarExemplar() {
		Main.exemplares.add(exemplar);
		assertEquals(exemplar,Main.buscarExemplar(1));
	}
	
	@Test
	public void testCalcularData() {
		devolucao = Main.calcularData(atual, devolucao, locatario);
		assertEquals(atual.get(Calendar.DAY_OF_MONTH) + Main.configuracao.getDiasAluno()  , devolucao.get(Calendar.DAY_OF_MONTH)  );
	}

	@Test
	public void testRelatorioGeral() {
		@SuppressWarnings("unchecked")
		ArrayList<Emprestimo> lista = (ArrayList<Emprestimo>) Main.relatorioEmprestimoGeral();
		assertEquals(em.getData_emp(), lista.get(0).getData_emp());
	
		assertEquals(em2.getData_emp(), lista.get(1).getData_emp());
	}


	
	
	
}