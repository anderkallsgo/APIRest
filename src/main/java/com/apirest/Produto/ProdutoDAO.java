package com.apirest.Produto;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository//utiliza dados do repository
@Transactional//informa que havera transações de dados
public class ProdutoDAO implements ProdutoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return entityManager.createQuery("from Produto p").getResultList();
    }

    @Override
    public void remover(int id) {
        entityManager.remove(entityManager.getReference(Produto.class,id));
    }

    @Override
    public Produto buscarPorId(int id) {
        return entityManager.find(Produto.class, id);
    }
}
