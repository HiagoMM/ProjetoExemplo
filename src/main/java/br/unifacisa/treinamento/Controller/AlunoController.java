package br.unifacisa.treinamento.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.unifacisa.treinamento.si.Aluno;
import br.unifacisa.treinamento.service.AlunoService;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoService alunoService ;
	
	@PostMapping(value = "Aluno/{aluno}")
	public void salvaAluno(@RequestBody Aluno aluno) {
		alunoService.salvaAluno(aluno);
	}
	
	@GetMapping(value = "Aluno/{id}")
	public Optional<Aluno> procuraAluno(@PathVariable String id){
		return alunoService.procuraAluno(id);
	}
	
	@DeleteMapping(value = "Aluno/{id}")
	public Boolean deleteAluno(@PathVariable String id) {
	
		return alunoService.deleteAluno(id);
	}
	
	@PutMapping(value = "Aluno/{id}/{curso}")
	public Boolean atualizaCursoAluno ( @PathVariable String id, @PathVariable String curso) {
		return alunoService.atualizaCursoAluno(id, curso);
	}
	
	@PutMapping(value = "Aluno/{id}/{nome}")
	public Boolean atualizaNomeAluno ( @PathVariable String id, @PathVariable String nome) {
		return alunoService.atualizaNomeAluno(id, nome);
	}
	
	@PutMapping(value = "Aluno/{aluno}")
	public Boolean atualizaCursoAluno ( @RequestBody Aluno alunoModificado) {
		return alunoService.atualizaAluno(alunoModificado);
	}
}
