package com.br.tallyflix.domain.repository;

import com.br.tallyflix.domain.entity.Produtora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoraRepository extends JpaRepository<Produtora, Long> {
}