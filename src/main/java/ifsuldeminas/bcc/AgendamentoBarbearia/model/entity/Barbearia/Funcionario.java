package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import javax.persistence.*;
import java.util.Set;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="class")
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFuncionario;
    @ManyToMany
    private Set<Horarios> horarios;
    private String nome;
    private String telefone;
}
