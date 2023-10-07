package utn.APIsinPaginacion.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.APIsinPaginacion.Entidades.Autor;
import utn.APIsinPaginacion.Service.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "APISP/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    public AutorController() {
    }

}
