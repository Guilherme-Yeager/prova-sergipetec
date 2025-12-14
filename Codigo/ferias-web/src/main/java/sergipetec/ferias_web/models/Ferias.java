package sergipetec.ferias_web.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import sergipetec.ferias_web.models.enums.Status;

@Entity
@Table(name = "ferias")
public class Ferias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dtInicial;

    private LocalDateTime dtFinal;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_servidor", nullable = false)
    private Servidor servidor;

    @OneToMany(mappedBy = "ferias")
    @JsonManagedReference
    private List<Pagamento> pagamentos;

    @OneToMany(mappedBy = "ferias")
    @JsonManagedReference
    private List<Local> locais;

    public Ferias() {}

    public Ferias(Long id, LocalDateTime dtInicial, LocalDateTime dtFinal, Status status, String descricao, Servidor servidor, List<Pagamento> pagamentos, List<Local> locais) {
        this.id = id;
        this.dtInicial = dtInicial;
        this.dtFinal = dtFinal;
        this.status = status;
        this.descricao = descricao;
        this.servidor = servidor;
        this.pagamentos = pagamentos;
        this.locais = locais;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }
}

