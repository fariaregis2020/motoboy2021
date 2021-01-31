package motoboyofficiall.br.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Cidade;

@Repository
@Transactional
public interface CidadeRepository extends CrudRepository<Cidade, Long> {

}
