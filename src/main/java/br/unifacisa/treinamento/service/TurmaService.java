package br.unifacisa.treinamento.service;


import java.util.List;

import br.unifacisa.treinamento.si.Aluno;
import br.unifacisa.treinamento.si.Turma;
import br.unifacisa.treinamento.repository.TurmaRepository;

public class TurmaService {

	TurmaRepository repository = new TurmaRepository();
	List<Turma> turmas = repository.lerTudo();
	
	
	private boolean checkDisponivel(Turma turma) {
		if ( turma.getSala().getDisponivel() ) {
			if( turma.getSala().getCapacidade() > turma.getAlunos().size() ) {
				return true;
			}
		}
		return false;
	}
	///////////////////////////////////////////////////////////////////////////////////////
	
	
	public Turma addAlunoNaTurma(Aluno aluno, Turma turma) {
		if (turma.getAlunos().size() == 0) {
			turma.getAlunos().add(aluno);
			return turma;
		}
		else if ( aluno.getCurso().equals(turma.getAlunos().get(0).getCurso())) {
			turma.getAlunos().add(aluno);
			return turma;
		}
		return null;
	}
	
	
	
	public Turma deleteTurma( Long id ) {            //DELETE
		for (int i = 0; i < turmas.size() ; i++) {
			if ( turmas.get(i).getId().equals(id) ) {
				Turma turma = turmas.get(i);
				turmas.remove(i);
				return turma ;
			}
		}
		return null;
	}


	public Turma addTurma(Turma turma) { //CREATE
		if (  checkDisponivel(turma) )  {
			repository.salvaTurma(turma);
			return turma;
		}
		return null;
	}
	
	public Turma procuraTurma(Long id){ // READ
		for (Turma turma : turmas) {
			if(turma.getId().equals(id)) {
				return turma;
			}
		}
		return null;
	
		
	}
	
	

	
	

}
