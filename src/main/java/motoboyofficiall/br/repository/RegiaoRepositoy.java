package motoboyofficiall.br.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Regiao;

@Repository
@Transactional
public interface RegiaoRepositoy extends CrudRepository<Regiao, Long> {

}
