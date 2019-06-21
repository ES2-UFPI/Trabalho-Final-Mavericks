package testes;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

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
   Emprestimo em; 
   Calendar atual = Calendar.getInstance();
   Calendar devolucao = Calendar.getInstance();
	@Before
	public void setUp() throws Exception {
		exemplar = new Livro(1, 3, "titulo", "autor", 3, 123);
		locatario = new Locatario("joao", "Aluno", "123", 1);
		Main.configuracao = new Configuracao(50,7 ,7,7);
	}

	@Test
	public void testEmprestimo() {
		em = new Emprestimo(exemplar,locatario,atual,devolucao);
		assertEquals(exemplar,em.getExemplar());
		assertEquals(locatario,em.getLocatario());
		assertEquals(atual,em.getData_emp());
		assertEquals(devolucao,em.getData_dev());
	}

	@Test
	public void testBuscarLocatario() {
		Main.locatarios.add(locatario);
		assertEquals(locatario,Main.buscarLocatario(1));
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


	
	
	
}