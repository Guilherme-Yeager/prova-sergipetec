package sergipetec.ferias_web.services;

import sergipetec.ferias_web.dtos.LocalDto;
import sergipetec.ferias_web.models.Local;
import org.springframework.stereotype.Service;
import sergipetec.ferias_web.repositories.LocalRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalService {

    private final LocalRepository localRepository;

    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public List<LocalDto> getAll() {
        List<Local> locais = localRepository.findAll();
        return locais.stream().map(LocalDto::new).collect(Collectors.toList());
    }

}
