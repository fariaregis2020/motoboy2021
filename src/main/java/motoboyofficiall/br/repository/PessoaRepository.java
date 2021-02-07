package motoboyofficiall.br.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Pessoa;

@Repository


@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long>  {

}
