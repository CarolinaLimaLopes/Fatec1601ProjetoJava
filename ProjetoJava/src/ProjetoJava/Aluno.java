package ProjetoJava;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aluno {

	private String nome;
	private int ra;
	private String curso;
	private String disciplina;
	private double prova;
	private double projeto1;
	private double projeto2;
	private int faltas;
	private double media;
	private String situacao;

	// TODO verificar formatação em decimal
	// deve retornar a saida da media com dois números decimais depois da vírgula
	public double calculaMedia() {
		this.media = ((this.prova * 0.4) + (this.projeto1 * 0.4) + (this.projeto2 * 0.2));
//		DecimalFormat df = new DecimalFormat("#.##");
//		String saida = df.format(media);
		return this.media;
	}

	public String calculaSituacao() {
		if (this.faltas >= 6) {
			this.situacao = "Reprovado por faltas";
		} else if ((this.media <= 5) && (this.faltas <= 5)) {
			this.situacao = "Reprovado";
		} else if ((this.media >= 6) && (this.faltas <= 5)) {
			this.situacao = "Aprovado";
		}
		return this.situacao;
	}

	public Aluno(String nome, int ra, String curso, String disciplina, double prova, double projeto1, double projeto2, int faltas, double media, String situacao) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
		this.disciplina = disciplina;
		this.prova = prova;
		this.projeto1 = projeto1;
		this.projeto2 = projeto2;
		this.faltas = faltas;
		this.media =  media;
		this.situacao = situacao;
	}

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getProva() {
		return prova;
	}

	public void setProva(double prova) {
		this.prova = prova;
	}

	public double getProjeto1() {
		return projeto1;
	}

	public void setProjeto1(double projeto1) {
		this.projeto1 = projeto1;
	}

	public double getProjeto2() {
		return projeto2;
	}

	public void setProjeto2(double projeto2) {
		this.projeto2 = projeto2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	ArrayList<Aluno> AlunoList = new ArrayList<Aluno>();

	public void incluir(Aluno alunos) {
		AlunoList.add(alunos);
	}

	public void excluir(Aluno alunos) {
		Aluno Aux = procurar(alunos);
		if (Aux != null) {
			AlunoList.remove(Aux);
		}
	}

	public void alterar(Aluno alunos) {
		excluir(alunos);
		incluir(alunos);
	}

	private Aluno procurar(Aluno alunos) {
		for (Aluno Aux : AlunoList) {
			if (Aux != null && Aux.equals(alunos)) {
				return Aux;
			}
		}
		return null;
	}

	public Collection<Aluno> listar(boolean b) {
		return AlunoList;
	}

	public Aluno[] listar() {
		Aluno[] retorno = new Aluno[AlunoList.size()];
		int i = 0;
		for (Aluno alunos : AlunoList) {
			retorno[i] = alunos;
			i++;
		}
		return retorno;
	}
	
	
}
