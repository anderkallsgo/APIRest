package com.apirest.Pessoa;

import java.util.Collection;

public interface PessoaRepository {

    void salvar(Pessoa pessoa);

    Collection<Pessoa> buscarTodas();

    void remover(int id);

    Pessoa buscarPorId(int id);
}
