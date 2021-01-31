package motoboyofficiall.br.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Bairro;

@Repository
@Transactional
public interface BairroRepository extends CrudRepository<Bairro, Long> {

}
