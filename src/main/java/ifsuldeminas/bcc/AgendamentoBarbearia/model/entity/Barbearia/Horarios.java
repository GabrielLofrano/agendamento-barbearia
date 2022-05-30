package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import  ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Cliente;
import  ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Agenda;
import java.util.Date;
import java.util.Set;

public class Horarios {
    private Cliente clientes;
    private Agenda agendas;
    private Set<Funcionario> funcionarios;
    private Set<FormaPagamento> formaDePagamento;
    private Date data;
    private String hora;
    private int idHorarios;
}
