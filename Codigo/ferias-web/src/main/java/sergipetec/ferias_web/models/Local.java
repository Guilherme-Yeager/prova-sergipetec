package sergipetec.ferias_web.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;
import sergipetec.ferias_web.dtos.LocalDto;

import java.time.LocalDateTime;

@Entity
@Table(name = "local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dtInicial;

    private LocalDateTime dtFinal;

    private String pais;

    private String regiao;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_ferias", nullable = false)
    @JsonBackReference
    private Ferias ferias;

    public Local() {}

    public Local(Long id, LocalDateTime dtInicial, LocalDateTime dtFinal, String pais, String regiao, String descricao, Ferias ferias) {
        this.id = id;
        this.dtInicial = dtInicial;
        this.dtFinal = dtFinal;
        this.pais = pais;
        this.regiao = regiao;
        this.descricao = descricao;
        this.ferias = ferias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(LocalDateTime dtInicial) {
        this.dtInicial = dtInicial;
    }

    public LocalDateTime getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(LocalDateTime dtFinal) {
        this.dtFinal = dtFinal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getDecricao() {
        return descricao;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }

    public Ferias getFerias() {
        return ferias;
    }

    public void setFerias(Ferias ferias) {
        this.ferias = ferias;
    }

    public Local(LocalDto localDto) {
        BeanUtils.copyProperties(localDto, this);
    }
}
