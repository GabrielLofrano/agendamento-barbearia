package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="FuncionarioBarbeiro")
public class FuncionarioBarbearia extends Funcionario {
    private int idBarbeiro;
}
