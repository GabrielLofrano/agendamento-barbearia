package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Agenda;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia.Horarios;

import javax.persistence.*;
import java.util.Set;



@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCliente;
    @ManyToMany
    private Set<Agenda> agendas;
    @OneToMany (mappedBy = "clientes")
    private Set<Horarios> horarios;
    private String Email;
    private String Endereco;
    private String Cidade;
    private String login;
    private String senha;
}
