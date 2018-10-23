package br.unifacisa.treinamento.si.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.treinamento.si.service.AlunoService;
import br.unifacisa.treinamento.si.Aluno;


@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService ;
	
	@GetMapping("/")
	public List<Aluno> getAll(){
		return alunoService.getAll();
	}
	
	@PostMapping("/")
	public void salvaAluno(@RequestBody Aluno aluno) {
		alunoService.salvaAluno(aluno);
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> procuraAluno(@PathVariable String id){
		return alunoService.procuraAluno(id);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteAluno(@PathVariable String id) {
	
		return alunoService.deleteAluno(id);
	}
	
	@PutMapping("/{id}/{nome}")
	public Boolean atualizaNomeAluno ( @PathVariable String id, @PathVariable String nome) {
		return alunoService.atualizaNomeAluno(id, nome);
	}
	
}
