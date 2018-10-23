package br.unifacisa.treinamento.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unifacisa.treinamento.si.Aluno;
import br.unifacisa.treinamento.si.Turma;
import br.unifacisa.treinamento.DBRepository.DBTurmaRepository;

@Service
public class TurmaService {
	
	
	@Autowired
	DBTurmaRepository repository ;
	
	
	
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
	
	public Boolean DeleteAlunoNaTurma(Aluno aluno,Turma turma) {
		if ( repository.existsById( turma.getId() ) ) {
			for(int i = 0;i < turma.getAlunos().size(); i++) {
				if (turma.getAlunos().get(i).equals(aluno)) {
					turma.getAlunos().remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public List<Aluno> getTodosOsAlunos (Turma turma ){
		if (repository.existsById(turma.getId())) {
			return turma.getAlunos();
		}return null;
	}

	public Boolean deleteTurma( String id ) {            //DELETE
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}


	public Turma addTurma(Turma turma) { //CREATE
		if (  checkDisponivel(turma) )  {
			repository.insert(turma);
			return turma;
		}
		return null;
	}
	
	public Optional<Turma> procuraTurma(String id){ // READ
		return repository.findById(id);	
	}

}
