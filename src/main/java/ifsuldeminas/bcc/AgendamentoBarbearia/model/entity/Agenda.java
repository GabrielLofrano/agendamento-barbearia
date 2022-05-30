package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Cliente;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia.Horarios;

import java.util.Set;
import javax.persistence.Entity;

@Entity
public class Agenda {

    private Set<Cliente> clientes;
    private Set<Horarios> horarios;
}

