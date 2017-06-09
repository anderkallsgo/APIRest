package com.apirest.Pessoa;

import com.apirest.EntidadeBase;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pessoa extends EntidadeBase{

    @Column
    @JsonView(Pessoa.class)
    private String nome;

    @Column
    @JsonView(Pessoa.class)
    private int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){
    }
}
