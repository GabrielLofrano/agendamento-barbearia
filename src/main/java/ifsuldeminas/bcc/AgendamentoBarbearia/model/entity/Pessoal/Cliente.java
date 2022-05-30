package ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Pessoal;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Agenda;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia.Horarios;
import java.util.Set;

public class Cliente {

    private Set<Agenda> agenda;
    private Set<Horarios> horarios;
    private long idCliente;
    private String Email;
    private String Endereco;
    private String Cidade;
    private String login;
    private String senha;
}
