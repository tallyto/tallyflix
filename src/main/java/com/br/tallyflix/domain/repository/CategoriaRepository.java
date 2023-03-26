package com.br.tallyflix.domain.repository;

import com.br.tallyflix.domain.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // Métodos do repositório (repository)
}