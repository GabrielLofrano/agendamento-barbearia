package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Cliente;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia.Horarios;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToMany (mappedBy = "agendas")
    private Set<Cliente> clientes;
    @OneToMany (mappedBy = "agendas")
    private Set<Horarios> horarios;
}

