package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import  ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Cliente;
import  ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Agenda;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;




@Entity

public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHorarios;
    @ManyToOne
    private Cliente clientes;

    @ManyToOne
    private Agenda agendas;

    @OneToMany
    @JoinColumn(name="idHorarios")
    private Set<Funcionario> funcionarios;
    @ManyToMany
    private Set<FormaPagamento> formaDePagamento;
    private Date data;
    private String hora;
}
