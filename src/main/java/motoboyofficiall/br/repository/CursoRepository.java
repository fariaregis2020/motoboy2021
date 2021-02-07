package motoboyofficiall.br.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import motoboyofficiall.br.entities.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {

}
