package motoboyofficiall.br.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Telefone2;

@Repository
@Transactional
public interface TelefoneRepository2 extends CrudRepository<Telefone2, Long> {

}
