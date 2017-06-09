package com.apirest.Produto;

import java.util.Collection;

public interface ProdutoRepository {

    void salvar(Produto produto);

    Collection<Produto> buscarTodos();

    void remover(int id);

    Produto buscarPorId(int id);
}
