package com.br.tallyflix.domain.service;

import com.br.tallyflix.domain.entity.Produtora;
import com.br.tallyflix.domain.repository.ProdutoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoraService {

    @Autowired
    private ProdutoraRepository produtoraRepository;

    public List<Produtora> findAll() {
        return produtoraRepository.findAll();
    }

    public Optional<Produtora> findById(Long id) {
        return produtoraRepository.findById(id);
    }

    public Produtora save(Produtora produtora) {
        return produtoraRepository.save(produtora);
    }

    public void deleteById(Long id) {
        produtoraRepository.deleteById(id);
    }
}