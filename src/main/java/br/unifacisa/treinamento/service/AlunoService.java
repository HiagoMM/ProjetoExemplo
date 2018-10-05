package br.unifacisa.treinamento.service;

import br.unifacisa.treinamento.si.Aluno;
import java.util.List;
import br.unifacisa.treinamento.repository.AlunoRepository;

public class AlunoService {
	
	AlunoRepository repository = new AlunoRepository();
	List<Aluno> alunos = lerTudo();
	
	public List<Aluno> lerTudo(){
		return repository.lerTudo();
	}
	
	
	
	
	public void salvaAluno(Aluno aluno) { //CREATE
		if ( !alunoExiste(aluno.getId()) ) {
			repository.salvaAluno(aluno);
		}	
	}
	
	public Aluno procuraAluno(Long id) { // READ
		return repository.procuraAluno(id);
	}
	
	
	public void deleteAluno(Long id) { //DELETE
		if ( !alunoExiste(id) ) {
			repository.deleteAluno(id);
		}
	}
	
	public void atualizaAluno(Aluno alunoModificado) { //UPDATE
		if ( alunoExiste(alunoModificado.getId()) ) {
			repository.atualizaAluno(alunoModificado);
		}
	}
	
	
	
	
	
	
	private boolean alunoExiste(Long id ) {
		boolean existe = false;
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getId().equals(id) ) {
				existe = true;
			}
		}
		return existe;
	}
}