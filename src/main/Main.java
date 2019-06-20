package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	private static ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
	private static ArrayList<Locatario> locatarios = new ArrayList<Locatario>();
	
	public static void main(String[] args) {
		int op;

		do {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Cadastro", "Emprestimo", "Devolucao","Relatorios","Pesquisar","Alterar Configuracao", "Sair"));
			op = mainMenu.getSelection();

			if (op == 1) {
				menuCadastro();
			} else if (op == 2) {
				emprestimo();
			} else if (op == 3) {
				devolucao();
			} else if (op == 4) {
				relatorios();
			} else if (op == 5) {
				pesquisar();
			} else if (op == 6) {
				alterarConfiguracao();
			}
		}while(op != 7);

		System.out.println("Fim!\n\n");
	}
	
	public static void menuCadastro() {
		int op;
		do {
			Menu mainMenu = new Menu("Menu Cadastro",Arrays.asList("Cadastrar Locatario","Cadastrar Exemplar","Cadastrar Configuracao","Sair"));
			op = mainMenu.getSelection();
			if(op==1) {
				cadastrarLocatario();
			} else if(op==2) {
				cadastrarExemplar();
			} else if(op==3) {
				configuracao();
			}
			
		}while(op!=4);
	}
	
	public static void emprestimo() {
	}
	public static void devolucao() {
	}
	public static void relatorios() {
	}
	public static void pesquisar() {
	}
	public static void alterarConfiguracao() {	
	}
	
	public static void cadastrarLocatario() {
	}
	public static void cadastrarExemplar() {
	}
	public static void configuracao() {
	}
	
	
	
}
