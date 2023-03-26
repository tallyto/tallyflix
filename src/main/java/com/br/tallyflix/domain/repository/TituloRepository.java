package com.br.tallyflix.domain.repository;

import com.br.tallyflix.domain.entity.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TituloRepository extends JpaRepository<Titulo, Long> {
}
