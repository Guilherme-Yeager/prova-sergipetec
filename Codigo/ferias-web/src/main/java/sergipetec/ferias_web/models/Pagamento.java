package sergipetec.ferias_web.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import sergipetec.ferias_web.models.enums.Tipo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private Tipo tipo;

    private LocalDateTime dt;

    @ManyToOne
    @JoinColumn(name = "id_ferias", nullable = false)
    @JsonBackReference
    private Ferias ferias;

    public Pagamento() {}

    public Pagamento(Long id, BigDecimal valor, Tipo tipo, LocalDateTime dt, Ferias ferias) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.dt = dt;
        this.ferias = ferias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public Ferias getFerias() {
        return ferias;
    }

    public void setFerias(Ferias ferias) {
        this.ferias = ferias;
    }

}
