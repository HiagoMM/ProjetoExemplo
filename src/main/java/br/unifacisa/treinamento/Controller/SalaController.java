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

import br.unifacisa.treinamento.service.SalaService;

import br.unifacisa.treinamento.si.Sala;

@RestController
public class SalaController {
	
	@Autowired
	SalaService salaService;
	
	@PostMapping(value = "Sala/{sala}")
	public void salvaSala(@RequestBody Sala sala) {
		salaService.addSala(sala);
	}
	
	@GetMapping(value = "Sala/{id}")
	public Optional<Sala> getSala(@PathVariable String id){
		return salaService.getSala(id);
	}
	
	@PutMapping(value = "Sala/{sala}")
	public Sala atualizaSala(@PathVariable Sala salaAtualizada) {
		return salaService.atualizaSala(salaAtualizada);
	}
	
	@PutMapping(value = "sala/{id}/{bolean}")
	public Boolean atualizaDisponibilidade(@PathVariable Boolean bolean,@PathVariable String id) {
		return salaService.atualizaDisponibilidade(bolean, id);
	}
	
	@DeleteMapping(value = "sala/{id}")
	public Boolean deleteSala(@PathVariable String id ) {
		return salaService.deleteSala(id);
	}
}
