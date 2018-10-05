package br.unifacisa.treinamento.repository;

import java.util.List;
import java.util.ArrayList;
import br.unifacisa.treinamento.si.*;

public class AlunoRepository {

	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	
	public List<Aluno> lerTudo(){
		return alunos;
	}
	
	
	
	public void salvaAluno(Aluno aluno) { //CREATE
		alunos.add(aluno);
	}
	
	public Aluno procuraAluno(Long id) { //READ
		for (Aluno aluno:this.alunos) {
			if ( aluno.getId().equals(id) ) {
				return aluno;
			}
		}
		return null;
		
	}
	
	
	
	public void atualizaAluno(Aluno alunoModificado) { // UPDATE
		for (Aluno aluno:alunos) {
			if ( aluno.getId().equals(alunoModificado.getId()) ) {
				aluno.setCurso(alunoModificado.getCurso());
				aluno.setNome(alunoModificado.getNome());
				break;
			}
		}
				
	}
	
	
	
	public void deleteAluno(Long id) { // Delete
		for(int i = 0 ; i < alunos.size(); i++) {
			if ( alunos.get(i).getId().equals(id) ) {
				alunos.remove(i);
				break;
			}
		}
	}
	
	
}
