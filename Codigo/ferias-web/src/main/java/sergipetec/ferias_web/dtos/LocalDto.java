package sergipetec.ferias_web.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import sergipetec.ferias_web.models.Local;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class LocalDto {

    private LocalDateTime dtInicial;
    private String pais;

    public LocalDto(LocalDateTime dtInicial, String pais) {
        this.dtInicial = dtInicial;
        this.pais = pais;
    }

    public LocalDateTime getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(LocalDateTime dtInicial) {
        this.dtInicial = dtInicial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDto(Local local) {
        BeanUtils.copyProperties(local, this);
    }
}