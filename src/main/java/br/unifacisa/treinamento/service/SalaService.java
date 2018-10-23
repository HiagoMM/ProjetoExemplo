package br.unifacisa.treinamento.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.treinamento.DBRepository.DBSalaRepository;
import br.unifacisa.treinamento.si.Sala;

@Service
public class SalaService {
	
	@Autowired
	DBSalaRepository repository;
	
	
	public Sala addSala(Sala salaNova) {  // CREATE
		if ( !repository.existsById( salaNova.getId() ) ) {
			if (!repository.existsBynumero(salaNova.getNumero())){
				return repository.insert(salaNova);
			}
		}
		return null;
	}
	
	
	public Optional<Sala> getSala(String id) { //READ
		return repository.findById(id);
	}
	
	
	public Sala atualizaSala(Sala salaAtualizada) { // UPDATE
		
		if ( repository.existsById( salaAtualizada.getId()) ) {
			repository.save(salaAtualizada);
			return salaAtualizada;
		}
		return null;
		
	}
	
	public Boolean atualizaDisponibilidade(Boolean bolean,String id) { // UPDATE
		if ( repository.existsById(id) ) {
			Optional<Sala> sala = repository.findById(id);
			sala.get().setDisponivel(bolean);
			return true;
		}
		return false;
	}
	public Boolean deleteSala( String id ) {
		if ( repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
	
	

}
	
	
