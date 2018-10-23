package br.unifacisa.treinamento.DBRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.unifacisa.treinamento.si.Turma;

@Repository
public interface DBTurmaRepository extends MongoRepository<Turma, String>{

}
