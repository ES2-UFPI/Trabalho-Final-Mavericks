package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	private static ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
	public static ArrayList<Locatario> locatarios = new ArrayList<Locatario>();
	public static int matricula = 0;
	private static Scanner s2;
	public static Configuracao configuracao;
	public static void main(String[] args) {
		int op;

		do {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Cadastro", "Emprestimo", "Devolucao",
					"Relatorios", "Pesquisar", "Alterar Configuracao", "Sair"));
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
		} while (op != 7);

		System.out.println("Fim!\n\n");
	}

	public static void menuCadastro() {
		int op;
		do {
			Menu mainMenu = new Menu("Menu Cadastro",
					Arrays.asList("Cadastrar Locatario", "Cadastrar Exemplar", "Cadastrar Configuracao", "Sair"));
			op = mainMenu.getSelection();
			if (op == 1) {
				cadastrarLocatario();
			} else if (op == 2) {
				cadastrarExemplar();
			} else if (op == 3) {
				configuracao();
			}

		} while (op != 4);
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
		s2 = new Scanner(System.in);
		;
		int op = 0;

		System.out.println("Cadastro de Locatario\n");
		System.out.println("Digite seu nome : ");
		String nome = s2.nextLine();
		String categoria = "";

		try {
			while (op == 0) {

				System.out.println("Selecione sua categoria: \n1 - Aluno \n2 - Professor \n3 - Técnico Adm.\n ");
				String str = s2.nextLine();

				op = Integer.parseInt(str);

				if (op == 1) {
					categoria = "Aluno";
				} else if (op == 2) {
					categoria = "Professor";
				} else if (op == 3) {
					categoria = "Tecnico Adm.";
				}
				if (op >= 4) {
					System.out.println("Opcao errada!");
					op = 0;
				}
			}

			System.out.println("Digite sua senha: ");
			String senha = s2.nextLine();

			cadastrarLocatario(nome, categoria, senha);

			System.out.println("Aperte qualquer tecla para voltar!\n");
			s2.nextLine();
		} catch (NumberFormatException e) {
			op = 0;
		}

	}

	public static void cadastrarLocatario(String nome, String categoria, String senha) {

		Locatario locatario = new Locatario(nome, categoria, senha, matricula);
		locatarios.add(locatario);
		System.out.println("Locatario " + nome + " cadastrado com sucesso! \nMatricula: " + matricula + "\n");
		matricula++;

	}

	public static void cadastrarExemplar() {
	}

	public static void configuracao() {
		s2 = new Scanner(System.in);
		s2.useLocale(Locale.US);
		System.out.println("Cadastrar Configuracao ");
		System.out.println("Informe o valor da multa: ");
		Double multa = s2.nextDouble();
		System.out.println("Informe o prazo do aluguel para alunos ");
		int alunos = s2.nextInt();
		System.out.println("Informe o prazo do aluguel para professores ");
		int prof = s2.nextInt();
		System.out.println("Informe o prazo do aluguel para tecnico-administrativos  ");
		int tec = s2.nextInt();
		configuracao = new Configuracao(multa, alunos, prof, tec);
	}

}
