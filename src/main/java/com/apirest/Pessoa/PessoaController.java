package com.apirest.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping(value = "/pessoa")

public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void salvar(@RequestBody Pessoa pessoa){
        pessoaRepository.salvar(pessoa);
    }
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Pessoa> buscarTodas(){
        return pessoaRepository.buscarTodas();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity remover(@PathVariable("id") int id){
        pessoaRepository.remover(id);
        return ResponseEntity.status(200).body("Excluido com sucesso");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity buscarPor (@PathVariable ("id") int id){
        return ResponseEntity.status(200).body(pessoaRepository.buscarPorId(id));
    }
}
