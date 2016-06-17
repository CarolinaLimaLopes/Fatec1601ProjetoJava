package ProjetoJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ProjetoJava.Aluno;

public class AlunoCollection {
	List<Aluno> AlunoLista = new ArrayList<Aluno>();

	// método incluir normal
	public void incluir(Aluno alunos) {
		AlunoLista.add(alunos);
	}

	// método excluir normal
	public void excluir(Aluno alunos) {
		Aluno Aux = procurar(alunos);
		if (Aux != null) {
			AlunoLista.remove(Aux);
		}
	}

	// método alterar normal
	public void alterar(Aluno alunos) {
		excluir(alunos);
		incluir(alunos);
	}

	// método procurar normal
	private Aluno procurar(Aluno alunos) {
		for (Aluno Aux : AlunoLista) {
			if (Aux != null && Aux.equals(alunos)) {
				return Aux;
			}
		}
		return null;
	}

	public Collection<Aluno> listar(boolean b) {
		return AlunoLista;
	}

	// método listar normal
	public Aluno[] listar() {
		Aluno[] retorno = new Aluno[AlunoLista.size()];
		int i = 0;
		for (Aluno alunos : AlunoLista) {
			retorno[i] = alunos;
			i++;
		}
		return retorno;
	}
}
