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
		s2 = new Scanner(System.in);
		System.out.println("1 - Pesquisar Locatario");
		System.out.println("2 - Pesquisar Exemplar");
		System.out.println("Digite a opcao de pesquisa: \n");
		
		int op = Integer.parseInt(s2.nextLine());
		if (op == 1) {
			System.out.println("Digite a matricula : ");
			int matri = Integer.parseInt(s2.nextLine());
			Locatario locatario = pesquisarLocatario(matri);

			if (locatario != null) {
				System.out.println("\nDados do Locatario\n");
				System.out.println("  Nome: " + locatario.getNome() + "\n  Matricula: "+ locatario.getMatricula() + "\n  Categoria: "+ locatario.getCategoria() + "\n");
				
			}else {
				System.out.println("Não encontrado");
			}
			System.out.println("Aperte qualquer tecla para voltar!\n");
			s2.nextLine();
		}

	}

	public static Locatario pesquisarLocatario(int matricu) {

		for (int i = 0; i < locatarios.size(); i++) {
			if (locatarios.get(i).matricula == matricu) {
				return locatarios.get(i);
			}
		}
		return null;

	}

	public static void alterarConfiguracao() {
		s2 = new Scanner(System.in);
		if(configuracao == null){
			System.out.println("N�o ha configuracoes cadastradas");
		}else{
			int aux;
			do{
			Menu mainMenu = new Menu("Alterar Configuracao", Arrays.asList("Multa", "Prazo de alunos", "Prazo de professores",
					"Prazo de tecnicos administrativos", "Sair"));
			aux = mainMenu.getSelection();
			if(aux == 1){
				System.out.println("Digite o valor da nova multa: ");
				double multa = s2.nextDouble();
				if(multa <= 0){
					System.out.println("Valor da multa invalido!");
				}else{
					alterarConfiguracaom(aux, multa);
				}
			}if(aux == 2){
				System.out.println("Digite o valor do novo prazo para alunos: ");
				int alu = s2.nextInt();
				if(alu <= 0){
					System.out.println("Valor do prazo invalido!");
				}else{
					alterarConfiguracaod(aux, alu);				}
			}if(aux == 3){
				System.out.println("Digite o valor do novo prazo para professores: ");
				int prof = s2.nextInt();
				if(prof <= 0){
					System.out.println("Valor do prazo invalido!");
				}else{
					alterarConfiguracaod(aux, prof);
				}
			}if(aux == 4){
				System.out.println("Digite o valor do novo prazo para tecnico-administrativos: ");
				int tec = s2.nextInt();
				if(tec <= 0){
					System.out.println("Valor do prazo invalido!");
				}else{
					alterarConfiguracaod(aux, tec);
				}
			}
			}while(aux != 5);
		}
	}
	
	public static void alterarConfiguracaom(int aux, double multa){
		configuracao.setMulta(multa);
		System.out.println("Valor da multa alterado!");
	}
	
	public static void alterarConfiguracaod(int aux, int dias){
		switch(aux){
		case 2: 
			configuracao.setDiasAluno(dias);
			break;
		case 3:
			configuracao.setDiasProf(dias);
			break;
		case 4: 
			configuracao.setDiasTec(dias);
			break;
		}
		System.out.println("Valor do prazo alterado!");
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

			System.out.println("Crie uma senha: ");
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
		System.out.println("Cadastrar Configurao ");
		System.out.println("Informe o valor da multa: ");
		Double multa = s2.nextDouble();
		System.out.println("Informe o prazo do aluguel para alunos ");
		int alunos = s2.nextInt();
		System.out.println("Informe o prazo do aluguel para professores ");
		int prof = s2.nextInt();
		System.out.println("Informe o prazo do aluguel para tecnico-administrativos  ");
		int tec = s2.nextInt();
		cadastrarConfiguracao(multa, alunos, prof, tec);
	}
	
	public static void cadastrarConfiguracao(double multa, int alunos, int prof, int tec){
		if((multa > 0) &&(alunos > 0) && (prof > 0) && (tec > 0)){
			configuracao = new Configuracao(multa, alunos, prof, tec);
			System.out.println("Configuracao cadastrada com sucesso!");
		}else{
			System.out.println("Esta configuracao e invalida!");
		}
	}

}
