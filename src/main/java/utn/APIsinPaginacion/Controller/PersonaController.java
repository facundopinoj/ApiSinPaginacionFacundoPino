package utn.APIsinPaginacion.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.APIsinPaginacion.Entidades.Persona;
import utn.APIsinPaginacion.Service.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="APISP/persona" )
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    public PersonaController() {
    }


}








