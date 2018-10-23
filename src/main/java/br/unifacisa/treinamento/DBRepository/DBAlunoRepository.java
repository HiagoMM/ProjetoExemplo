package br.unifacisa.treinamento.DBRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.unifacisa.treinamento.si.Aluno;


@Repository
public interface DBAlunoRepository extends MongoRepository<Aluno, String>{
}
