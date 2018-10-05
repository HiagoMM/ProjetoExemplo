package br.unifacisa.treinamento.repository;

import java.util.List;
import java.util.ArrayList;
import br.unifacisa.treinamento.si.Sala;;

public class SalaRepository {
	
	List<Sala> salas = new ArrayList<Sala>();
		
	public List<Sala> lerTudo(){
		return salas;
	}
	
	
	public void addSala(Sala sala) { //CREATE
		salas.add(sala);
	}
	
	public Sala getSala (Long id) { //READ
		for (int i = 0; i < salas.size() ; i++) {
			if ( salas.get(i).getId().equals(id) ) {
				return salas.get(i);
			}
		}
		return null;
	}
	
	public void atualizaSala(Sala salaAtualizada) { //UPDATE
		for (int i = 0; i < salas.size() ; i++) {
			if ( salas.get(i).getId().equals(salaAtualizada.getId()) ) { 
				salas.get(i).setDisponivel( salaAtualizada.getDisponivel() );
				salas.get(i).setCapacidade( salaAtualizada.getCapacidade() );
				
			}
		}
	}
	
	
	public void deleteSala( Long id ) {//DELETE
		for (int i = 0 ; i < salas.size() ;i++){
			if ( salas.get(i).getId().equals(id) ) {
				salas.remove(i);
			}
		}
	}
	
	
}
