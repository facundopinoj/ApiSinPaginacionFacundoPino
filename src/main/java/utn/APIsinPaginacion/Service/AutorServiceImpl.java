package utn.APIsinPaginacion.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.APIsinPaginacion.Entidades.Autor;
import utn.APIsinPaginacion.Repository.AutorRepository;
import utn.APIsinPaginacion.Repository.BaseRepository;


@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
        this.autorRepository = this.autorRepository;
    }
}
