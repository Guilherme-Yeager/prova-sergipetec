package sergipetec.ferias_web.controllers;


import org.springframework.web.bind.annotation.*;
import sergipetec.ferias_web.models.Ferias;
import sergipetec.ferias_web.services.FeriasService;

@RestController
@RequestMapping("/ferias")
public class FeriasController {

    private final FeriasService feriasService;

    public FeriasController(FeriasService feriasService) {
        this.feriasService = feriasService;
    }

    @GetMapping("/{id}")
    public Ferias buscar(@PathVariable Long id) {
        return feriasService.getById(id);
    }

}
