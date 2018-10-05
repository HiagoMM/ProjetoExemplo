package br.unifacisa.treinamento.service;

import java.util.List;
import br.unifacisa.treinamento.repository.SalaRepository;
import br.unifacisa.treinamento.si.Sala;

public class SalaService {
	
	
	SalaRepository repository = new SalaRepository();
	List<Sala> salas = repository.lerTudo();
	
	public Sala addSala(Sala salaNova) {  // CREATE
		if ( !salaExiste(salaNova.getId()) ) {
			for (Sala sala : salas) {
				if ( sala.getNumero().equals(salaNova.getNumero()) ) {
					return null;
				}
			}
		}
		repository.addSala(salaNova);
		return salaNova;
		
	}
	
	
	public Sala getSala(Long id) { //READ
		return repository.getSala(id);
	}
	
	
	public Sala atualizaSala(Sala salaAtualizada) { // UPDATE
		
		if ( salaExiste(salaAtualizada.getId()) ) {
			repository.atualizaSala(salaAtualizada);
			return salaAtualizada;
		}
		return null;
		
	}
	
	public 
	
	
	

	
	
	
	
	
	
	private boolean salaExiste(Long id ) {
		boolean existe = false;
		for (int i = 0; i < salas.size(); i++) {
			if (salas.get(i).getId().equals(id) ) {
				existe = true;
			}
		}
		return existe;
	}
}
	
	
