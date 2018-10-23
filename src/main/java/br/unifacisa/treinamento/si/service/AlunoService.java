package br.unifacisa.treinamento.si.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import br.unifacisa.treinamento.si.DBRepository.DBAlunoRepository;
import br.unifacisa.treinamento.si.Aluno;



@Service
public class AlunoService {
	
	
	@Autowired
	private DBAlunoRepository repository;
	
	
	public List<Aluno> getAll(){
		return repository.findAll();
	}
	
	public Aluno salvaAluno(Aluno aluno) { //CREATE
		
		return repository.insert(aluno);
		
	
	}
	
	public Optional<Aluno> procuraAluno(String id) { // READ
		return repository.findById(id);
	}
	
	
	public Boolean deleteAluno(String id) { //DELETE
		if ( !repository.existsById(id) ) {
			repository.deleteById(id);
			return true;
		}return false;
	}
	
	public Boolean atualizaAluno(Aluno alunoModificado) { //UPDATE
		if ( repository.existsById( alunoModificado.getId() )) {
			repository.save(alunoModificado);
			return true;
		}
		return false;
	}	
	
	public Boolean atualizaCursoAluno ( String id, String curso) {
		if( repository.existsById(id) ) {
			Optional<Aluno> aluno = procuraAluno(id);
			aluno.get().setCurso(curso);
			return true;
		}return false;
	}
	
	public Boolean atualizaNomeAluno ( String id, String nome) {
		if( repository.existsById(id) ) {
			Optional<Aluno> aluno = procuraAluno(id);
			aluno.get().setNome(nome);
			return true;
		}return false;
	}

}
