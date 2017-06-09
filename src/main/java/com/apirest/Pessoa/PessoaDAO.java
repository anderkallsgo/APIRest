package com.apirest.Pessoa;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository
@Transactional
public class PessoaDAO implements PessoaRepository{

    @PersistenceContext
    EntityManager entityMananger;

    @Override
    public void salvar(Pessoa pessoa) {
        entityMananger.persist(pessoa);
    }

    @Override
    public Collection<Pessoa> buscarTodas() {
        return entityMananger.createQuery("from Pessoa p").getResultList();
    }

    @Override
    public void remover(int id) {
        entityMananger.remove(entityMananger.getReference(Pessoa.class, id));
    }

    @Override
    public Pessoa buscarPorId(int id) {
        return entityMananger.find(Pessoa.class, id);
    }
}
