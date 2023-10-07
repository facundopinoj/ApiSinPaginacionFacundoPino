package utn.APIsinPaginacion.Service;

import org.springframework.stereotype.Service;
import utn.APIsinPaginacion.Entidades.Localidad;
import utn.APIsinPaginacion.Repository.BaseRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
