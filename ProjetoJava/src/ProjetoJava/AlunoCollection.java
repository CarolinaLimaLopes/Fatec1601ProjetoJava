package ProjetoJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ProjetoJava.Aluno;

public class AlunoCollection {
	List<Aluno> AlunoLista = new ArrayList<Aluno>();

	// m�todo incluir normal
	public void incluir(Aluno alunos) {
		AlunoLista.add(alunos);
	}

	// m�todo excluir normal
	public void excluir(Aluno alunos) {
		Aluno Aux = procurar(alunos);
		if (Aux != null) {
			AlunoLista.remove(Aux);
		}
	}

	// m�todo alterar normal
	public void alterar(Aluno alunos) {
		excluir(alunos);
		incluir(alunos);
	}

	// m�todo procurar normal
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

	// m�todo listar normal
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
