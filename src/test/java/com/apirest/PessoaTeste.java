package com.apirest;

import com.apirest.Pessoa.Pessoa;
import com.apirest.Pessoa.PessoaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaTeste {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Test
    public void deve_salvar_uma_pessoa_no_banco_de_dados(){
        Pessoa kennedy = new Pessoa("Kennedy Jedi", 18);
        pessoaRepository.salvar(kennedy);

        System.out.println(kennedy.getId());
    }
}
