package com.apirest;

import com.apirest.Pessoa.Pessoa;
import com.apirest.Pessoa.PessoaRepository;
import com.apirest.Produto.Produto;
import com.apirest.Produto.ProdutoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoTeste {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void deve_salvar_um_produto_no_banco() {
        Produto geladeira = new Produto("Geladeira Eletrolux", 1000d);
        produtoRepository.salvar(geladeira);

        System.out.println(geladeira.getId());

        assertNotNull(geladeira.getId());
    }
    @Test
    public void deve_excluir_um_produto_do_banco(){
        produtoRepository.remover(3);
        System.out.println(ResponseEntity.status(200).body("Produto excluído com sucesso"));
    }
    @Test
    public void deve_listar_todos_os_produtos_do_banco_de_dados(){
        System.out.println(produtoRepository.buscarTodos());
    }
}
