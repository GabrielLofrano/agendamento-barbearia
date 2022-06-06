package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="FuncionarioGerente")
public class FuncionarioGerente extends Funcionario {
    private int idGenrente;
}
