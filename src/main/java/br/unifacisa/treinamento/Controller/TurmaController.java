package br.unifacisa.treinamento.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.unifacisa.treinamento.service.TurmaService;
import br.unifacisa.treinamento.si.Aluno;
import br.unifacisa.treinamento.si.Turma;

@RestController
public class TurmaController {
	
	@Autowired
	TurmaService turmaService;
	
	@PostMapping(value = "Turma/{Turma}/{Aluno}")
	public Turma addAlunoNaTurma(@RequestBody Aluno aluno,@RequestBody Turma turma){
		return turmaService.addAlunoNaTurma(aluno, turma);
	}
	
	@DeleteMapping(value = "Turma/{id}")
	public Boolean deleteTurma(@PathVariable String id ) {
		return turmaService.deleteTurma(id);
	}
	
	@PostMapping(value = "Turma/{turma}")
	public Turma addTurma(@PathVariable Turma turma) {
		return turmaService.addTurma(turma);
	}
	@GetMapping(value = "Turma/{id}")
	public Optional<Turma> procuraTurma(@PathVariable String id){
		return turmaService.procuraTurma(id);
	}
	
	@GetMapping(value = "Turma/Alunos/{turma}")
	public List<Aluno> getTodosOsAlunos (@PathVariable Turma turma ){
		return turmaService.getTodosOsAlunos(turma);
	}
	
	@DeleteMapping(value = "Turma/Alunos/{aluno}/{turma}")
	public Boolean DeleteAlunoNaTurma(@PathVariable Aluno aluno,@PathVariable Turma turma) {
		return turmaService.DeleteAlunoNaTurma(aluno, turma);
	}
}
