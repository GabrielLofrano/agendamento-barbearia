package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Cliente;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Agenda;

//import javax.persistence.*;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;




@Entity

public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long idHorarios;
//    @ManyToOne
//    private Cliente clientes;
//
//    @ManyToOne
//    private Agenda agendas;
    private long id;
    @NotNull
    @NotBlank
    private String nome;
    @NotNull
    @DecimalMin(value = "1.49")
    private double valorPorMinuto;

    public Horarios() {

    }

    private long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {return nome;}

    public void setNome (String nome) { this.nome= nome; }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }

}
//    @ManyToMany(mappedBy = "horarios")
//    private Set<Funcionario> funcionarios;
//    @ManyToMany
//    private Set<FormaPagamento> formaDePagamento;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date data;
//    private String hora;
//}
