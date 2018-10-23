package br.unifacisa.treinamento.si.Controller;

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

import br.unifacisa.treinamento.si.service.SalaService;

import br.unifacisa.treinamento.si.Sala;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	SalaService salaService;
	
	@PostMapping(value = "/{sala}")
	public void salvaSala(@RequestBody Sala sala) {
		salaService.addSala(sala);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Sala> getSala(@PathVariable String id){
		return salaService.getSala(id);
	}
	
	@PutMapping(value = "/{sala}")
	public Sala atualizaSala(@PathVariable Sala salaAtualizada) {
		return salaService.atualizaSala(salaAtualizada);
	}
	
	@PutMapping(value = "/{id}/{bolean}")
	public Boolean atualizaDisponibilidade(@PathVariable Boolean bolean,@PathVariable String id) {
		return salaService.atualizaDisponibilidade(bolean, id);
	}
	
	@DeleteMapping(value = "/{id}")
	public Boolean deleteSala(@PathVariable String id ) {
		return salaService.deleteSala(id);
	}
}
