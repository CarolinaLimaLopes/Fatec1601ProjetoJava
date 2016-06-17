package ProjetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	// static List<Aluno> AlunoLista = new ArrayList<Aluno>();

	// public void insereAluno(Aluno aluno) {
	// AlunoLista.add(aluno);
	// }

	public static void main(String[] args) {

		ArrayList<Aluno> AlunoList = new ArrayList<Aluno>();
		//Teste meuTeste = new Teste();

		Aluno aluno = new Aluno();
		String opcao = "0";
		Scanner leitor = new Scanner(System.in);

		while (!opcao.equals("9")) {
			System.out.println("##################################");
			System.out.println("#           MENU                 #");
			System.out.println("#------------------------------- #");
			System.out.println("#   OPCAO 1 - LISTAR             #");
			System.out.println("#   OPCAO 2 - CADASTRAR          #");
			System.out.println("#   OPCAO 3 - EXCLUIR            #");
			System.out.println("#   OPCAO 4 - ALTERAR            #");
			System.out.println("#   OPCAO 9 - SAIR               #");
			System.out.println("##################################");
			opcao = leitor.nextLine();

			String nome;
			int ra;
			String curso;
			String disciplina;
			double prova;
			double projeto1;
			double projeto2;
			int faltas;
			double media;
			String situacao;

			switch (opcao) {
			case "1":
				System.out.println("##################################");
				System.out.println("#           MENU                 #");
				System.out.println("#------------------------------- #");
				System.out.println("#            +LISTAR+            #");
				System.out.println("#                                #");
				for (Aluno lista : aluno.listar()) {
					if (lista != null) {
						System.out.println("#       Nome: " + lista.getNome() + "     #");
						System.out.println("#         RA: " + lista.getRa() + "     #");
						System.out.println("#      Curso: " + lista.getCurso() + "     #");
						System.out.println("# Disciplina: " + lista.getDisciplina() + "     #");
						System.out.println("#      Prova: " + lista.getProva() + "     #");
						System.out.println("#  Projeto 1: " + lista.getProjeto1() + "     #");
						System.out.println("#  Projeto 2: " + lista.getProjeto2() + "     #");
						System.out.println("#     Faltas: " + lista.getFaltas() + "     #");
						System.out.println("#      Média: " + lista.getMedia() + "     #");
						System.out.println("#   Situação: " + lista.getSituacao() + "     #");
						System.out.println("#                                #");
						System.out.println("##################################");
					}
				}
				System.out.println("##################################");
				leitor.nextLine();
				break;
			case "2":
				System.out.println("##################################");
				System.out.println("#           MENU                 #");
				System.out.println("#------------------------------- #");
				System.out.println("#         +CADASTRAR+            #");
				System.out.println("#                                #");
				System.out.println("#   digite nome, RA, curso       #");
				System.out.println("#   disciplina, prova, projeto 1 #");
				System.out.println("#   projeto 2, faltas:           #");
				System.out.println("#                                #");
				System.out.println("##################################");

				String nome2 = leitor.nextLine();
				String ra2 = leitor.nextLine();
				String curso2 = leitor.nextLine();
				String disciplina2 = leitor.nextLine();
				String prova2 = leitor.nextLine();
				String projeto12 = leitor.nextLine();
				String projeto22 = leitor.nextLine();
				String faltas2 = leitor.nextLine();
				String media2 = leitor.nextLine();
				String situacao2 = leitor.nextLine();

				// aluno.calculaMedia(media);
				// aluno.calculaSituacao(situacao);

				/**
				 * cadastrar a media e situação chamando os métodos se baseando
				 * pela nota e falta
				 */

				aluno = new Aluno(nome2, Integer.parseInt(ra2), curso2, disciplina2, Double.parseDouble(prova2),
						Double.parseDouble(projeto12), Double.parseDouble(projeto22), Integer.parseInt(faltas2),
						Double.parseDouble(media2), situacao2);
				AlunoList.add(aluno);

				break;
			case "3":
				System.out.println("##################################");
				System.out.println("#           MENU                 #");
				System.out.println("#------------------------------- #");
				System.out.println("#         +EXCLUIR+              #");
				System.out.println("#                                #");
				System.out.println("#        digite RA:              #");
				System.out.println("#                                #");
				System.out.println("##################################");

				ra2 = leitor.nextLine();
				aluno = new Aluno();

				ra2 = leitor.nextLine();

				if (ra2.equals(aluno.getRa())) {
					AlunoList.remove(aluno);
				}

				break;
			case "4":
				System.out.println("##################################");
				System.out.println("#           MENU                 #");
				System.out.println("#------------------------------- #");
				System.out.println("#            +ALTERAR+           #");
				System.out.println("#                                #");
				System.out.println("#   digite nome, RA, curso       #");
				System.out.println("#   disciplina, prova, projeto 1 #");
				System.out.println("#   projeto 2, faltas:           #");
				System.out.println("#                                #");
				System.out.println("##################################");

				nome2 = leitor.nextLine();
				ra2 = leitor.nextLine();
				curso2 = leitor.nextLine();
				disciplina2 = leitor.nextLine();
				prova2 = leitor.nextLine();
				projeto12 = leitor.nextLine();
				projeto22 = leitor.nextLine();
				faltas2 = leitor.nextLine();
				media2 = leitor.nextLine();
				situacao2 = leitor.nextLine();

				aluno = new Aluno(nome2, Integer.parseInt(ra2), curso2, disciplina2, Double.parseDouble(prova2),
						Double.parseDouble(projeto12), Double.parseDouble(projeto22), Integer.parseInt(faltas2),
						Double.parseDouble(media2), situacao2);

				if (ra2.equals(aluno.getRa())) {
					AlunoList.remove(aluno);
					AlunoList.add(aluno);
				}

				break;
			case "9":
				System.out.println("Bye Bye!!!");
				break;
			default:
				break;
			}

		}

		// for (int i = 0; i < meuTeste.AlunoLista.size(); i++) {
		// Aluno novoAluno = new Aluno();
		// novoAluno.setNome("aluno_" + i);
		// meuTeste.insereAluno(novoAluno);
		// }

		// for (Aluno aluno : meuTeste.AlunoLista) {
		// System.out.println(aluno.getNome());
		// }

		/**
		 * TESTE
		 */

		// Aluno objAluno1 = new Aluno();
		// objAluno1.setNome("Carol");
		// objAluno1.setRa(14211778);
		// objAluno1.setCurso("ADS");
		// objAluno1.setDisciplina("POO");
		// objAluno1.setProva(8.5);
		// objAluno1.setProjeto1(9.5);
		// objAluno1.setProjeto2(5.2);
		// objAluno1.setFaltas(4);
		// objAluno1.calculaMedia();
		// objAluno1.calculaSituacao();
		//
		// System.out.println(objAluno1.getNome() + "-" + objAluno1.getRa() +
		// "-" + objAluno1.getCurso() + "-"
		// + objAluno1.getDisciplina() + "-" + objAluno1.getProva() + "-" +
		// objAluno1.getProjeto1() + "-"
		// + objAluno1.getProjeto2() + "-" + objAluno1.getFaltas() + "-" +
		// objAluno1.getMedia() + "-"
		// + objAluno1.getSituacao());
	}
}
