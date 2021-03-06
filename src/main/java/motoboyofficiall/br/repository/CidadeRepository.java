package motoboyofficiall.br.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Cidade;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long> {

}
