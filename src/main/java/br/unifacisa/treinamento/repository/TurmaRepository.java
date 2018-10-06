package br.unifacisa.treinamento.repository;

import java.util.ArrayList;
import java.util.List;
import br.unifacisa.treinamento.si.Turma;

public class TurmaRepository {

	List<Turma> turmas = new ArrayList<Turma>();
	
	
	public List<Turma> lerTudo(){
		return turmas;
	}

	
	public void salvaTurma(Turma turma) { //CREATE
		turmas.add(turma);
	}
	
	public Turma procuraTurma(Long id) { //READ
		for (Turma turma : this.turmas) {
			if ( turma.getId().equals(id) ) {
				return turma;
			}
		}
		return null;
		
	}
	
	
	public void atualizaTurma(Turma turmaModificada) { // UPDATE
		for (Turma turma:turmas) {
			if ( turma.getId().equals(turmaModificada.getId()) ) {
				turma.setPeriodo( turmaModificada.getPeriodo() );
				turma.setSala(turmaModificada.getSala());
				break;
			}
		}
				
	}
	
	public void deleteturma(Long id) { // Delete
		for(int i = 0 ; i < turmas.size(); i++) {
			if ( turmas.get(i).getId().equals(id) ) {
				turmas.remove(i);
				break;
			}
		}
	}



}
