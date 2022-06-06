package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import javax.persistence.*;
import java.util.Set;




@Entity
public class FormaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFormaPagamento;
    @ManyToMany (mappedBy = "formaDePagamento")
    private Set<Horarios> horarios;
    private String formaPagamento;
    private String descricao;
}
