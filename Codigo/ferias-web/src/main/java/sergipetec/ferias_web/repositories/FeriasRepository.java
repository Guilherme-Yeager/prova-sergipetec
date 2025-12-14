package sergipetec.ferias_web.repositories;

import sergipetec.ferias_web.models.Ferias;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeriasRepository extends JpaRepository<Ferias, Long> {

    List<Ferias> findAllByServidorId(Long idServidor);

}
