package com.br.tallyflix.domain.repository;

import com.br.tallyflix.domain.entity.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository  extends JpaRepository<Plano, Long> {
}
