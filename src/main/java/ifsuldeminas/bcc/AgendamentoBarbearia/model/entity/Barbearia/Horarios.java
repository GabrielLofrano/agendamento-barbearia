package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Cliente;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal.Agenda;


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
    private long idHorarios;
    @NotNull
    @NotBlank
    private String nome;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String hora;
    
    public Horarios() {

    }

    private long getId() {
        return idHorarios;
    }

    public void setId(long id) {
        this.id = idHorarios;
    }
    public Date getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(double data) {
        this.hora = hora;
    }

}
