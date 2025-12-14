package sergipetec.ferias_web.services;

import org.springframework.stereotype.Service;
import sergipetec.ferias_web.execptions.ServiceNotFoundException;
import sergipetec.ferias_web.models.Ferias;
import sergipetec.ferias_web.repositories.FeriasRepository;
import java.util.List;

@Service
public class FeriasService {

    private final FeriasRepository feriasRepository;

    public FeriasService(FeriasRepository feriasRepository) {
        this.feriasRepository = feriasRepository;
    }

    public List<Ferias> getAll(Long idServidor) {
        return feriasRepository.findAllByServidorId(idServidor);
    }

    public Ferias getById(Long id) {
        return feriasRepository.findById(id)
                .orElseThrow(() -> new ServiceNotFoundException("Férias não encontrada"));
    }

    public Ferias create(Ferias ferias) {
        return feriasRepository.save(ferias);
    }

}
