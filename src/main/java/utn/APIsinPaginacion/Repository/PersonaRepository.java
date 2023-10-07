package utn.APIsinPaginacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.APIsinPaginacion.Entidades.Persona;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
}
