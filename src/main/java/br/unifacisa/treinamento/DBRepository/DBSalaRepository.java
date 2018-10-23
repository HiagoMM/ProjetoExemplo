package br.unifacisa.treinamento.DBRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.unifacisa.treinamento.si.Sala;

@Repository
public interface DBSalaRepository extends MongoRepository<Sala, String>{
	
	Boolean existsBynumero (Integer numero);
}
