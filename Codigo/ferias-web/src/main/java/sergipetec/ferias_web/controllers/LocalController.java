package sergipetec.ferias_web.controllers;

import sergipetec.ferias_web.dtos.LocalDto;
import sergipetec.ferias_web.models.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sergipetec.ferias_web.services.LocalService;

import java.util.List;

@RestController
@RequestMapping("/locais")
public class LocalController {

    private final LocalService localService;

    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    @GetMapping
    public List<LocalDto> listar() {
        return localService.getAll();
    }

}
