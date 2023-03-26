package com.br.tallyflix.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "produtoras")
@Getter
@Setter
public class Produtora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String paisOrigem;

    // construtores, getters e setters
}
