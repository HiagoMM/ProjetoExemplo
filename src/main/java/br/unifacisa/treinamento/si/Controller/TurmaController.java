package br.unifacisa.treinamento.si.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.unifacisa.treinamento.si.service.TurmaService;
import br.unifacisa.treinamento.si.Aluno;
import br.unifacisa.treinamento.si.Turma;

@RestController
@RequestMapping("/turma")
public class TurmaController {
	
	@Autowired
	TurmaService turmaService;
	
	@PostMapping(value = "/{Turma}/{Aluno}")
	public Turma addAlunoNaTurma(@RequestBody Aluno aluno,@RequestBody Turma turma){
		return turmaService.addAlunoNaTurma(aluno, turma);
	}
	
	@DeleteMapping(value = "/{id}")
	public Boolean deleteTurma(@PathVariable String id ) {
		return turmaService.deleteTurma(id);
	}
	
	@PostMapping(value = "/{turma}")
	public Turma addTurma(@PathVariable Turma turma) {
		return turmaService.addTurma(turma);
	}
	@GetMapping(value = "/{id}")
	public Optional<Turma> procuraTurma(@PathVariable String id){
		return turmaService.procuraTurma(id);
	}
	
	@GetMapping(value = "/Alunos/{turma}")
	public List<Aluno> getTodosOsAlunos (@PathVariable Turma turma ){
		return turmaService.getTodosOsAlunos(turma);
	}
	
	@DeleteMapping(value = "/Alunos/{aluno}/{turma}")
	public Boolean DeleteAlunoNaTurma(@PathVariable Aluno aluno,@PathVariable Turma turma) {
		return turmaService.DeleteAlunoNaTurma(aluno, turma);
	}
}
