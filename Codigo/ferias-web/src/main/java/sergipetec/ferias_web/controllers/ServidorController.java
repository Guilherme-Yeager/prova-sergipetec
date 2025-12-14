package sergipetec.ferias_web.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import sergipetec.ferias_web.models.Ferias;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sergipetec.ferias_web.services.FeriasService;
import java.util.List;

@RestController
@RequestMapping("/servidores")
public class ServidorController {

    private final FeriasService feriasService;

    public ServidorController(FeriasService feriasService) {
        this.feriasService = feriasService;
    }

    @GetMapping("/{idServidor}/ferias")
    public List<Ferias> listarPorServidor(@PathVariable Long idServidor) {
        return feriasService.getAll(idServidor);
    }

}
