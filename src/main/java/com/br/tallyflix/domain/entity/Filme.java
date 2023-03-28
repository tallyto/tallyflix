package com.br.tallyflix.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;

@Entity(name = "filmes")
@Getter
@Setter
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private LocalDate lancamento;

    private Time duracao;

    @Column(name = "classificacao_indicativa")
    private String classificacaoIndicativa;

}
