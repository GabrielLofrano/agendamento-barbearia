package ifsuldeminas.bcc.AgendamentoBarbearia.controller.comercial;

import ifsuldeminas.bcc.AgendamentoBarbearia.model.entity.Barbearia.Horarios;
import ifsuldeminas.bcc.AgendamentoBarbearia.model.repositories.comercial.HorariosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/planos")
public class HorariosController {
    private HorariosRepository horariosRepository;


    public HorariosController(HorariosRepository horariosRepository){
        this.horariosRepository = horariosRepository;
    }

    //implementacao de metodos para tratamento das requisicoes correspondentes
    //`as operacoes CRUD para Plano:

    //operacoes Read:

    //obtem uma lista dos planos cadastrados
    @GetMapping
    public List<Horarios> list(){
        //fazer uma consulta no BD
        return horariosRepository.findAll();
    }

    //obtem dados de um plano
    @GetMapping("/{id}")
    public ResponseEntity<Horarios> show(@PathVariable Long id){
        //fazer uma busca no BD pelo id do plano
        Optional<Horarios> opt = horariosRepository.findById(id);
        //verificando se encontrou um Plano com o id informado
        if(opt.isPresent()){
            return new ResponseEntity<Horarios>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<Horarios>(HttpStatus.NOT_FOUND);
        }
    }

    //operacao Create
    @PostMapping
    public Horarios save(@Valid @RequestBody Horarios horarios){
        //posteriormente: implementar tratamento de erros

        //cadastrar o plano no BD
        return horariosRepository.save(horarios);
    }

    //operacao Update
    @PutMapping("/{id}")
    public ResponseEntity<Horarios> update(@PathVariable Long id, @Valid @RequestBody Horarios horarios){
        //posteriormente: implementar tratamento de erros

        //buscar o plano no BD
        //fazer uma busca no BD pelo id do plano
        Optional<Horarios> opt = horariosRepository.findById(id);
        //verificando se encontrou um Plano com o id informado
        if(opt.isPresent()) {
            Horarios horariosAux = opt.get();
            //atualizar os dados do plano
            horariosAux.setNome(horarios.getNome());
            horariosAux.setValorPorMinuto(horarios.getValorPorMinuto());
            //atualizar os dados do plano no BD
            horariosRepository.save(horariosAux);
            return new ResponseEntity<Horarios>(horariosAux, HttpStatus.OK);
        }else{
            return new ResponseEntity<Horarios>(HttpStatus.NOT_FOUND);
        }
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Horarios> delete(@PathVariable Long id){
        try{
            //excluir o plano no BD pelo id
            horariosRepository.deleteById(id);
            return new ResponseEntity<Horarios>(HttpStatus.NO_CONTENT);
        }catch(RuntimeException e){
            return new ResponseEntity<Horarios>(HttpStatus.NOT_FOUND);
        }
    }
}
