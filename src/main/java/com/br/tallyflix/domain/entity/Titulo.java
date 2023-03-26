package com.br.tallyflix.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "titulos")
@Getter
@Setter
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sinopse;

    private LocalDate dataLancamento;

    @ManyToMany
    private List<Categoria> categorias;

    @ManyToOne
    private Produtora produtora;

}