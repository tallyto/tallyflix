package com.br.tallyflix.domain.repository;

import com.br.tallyflix.domain.entity.Produtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoraRepository extends JpaRepository<Produtora, Long> {
}