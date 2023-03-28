package com.br.tallyflix.domain.service;

import com.br.tallyflix.domain.entity.Filme;
import com.br.tallyflix.domain.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository tituloRepository;

    public void deleteById(Long id) {
        tituloRepository.deleteById(id);
    }

    public Filme save(Filme titulo) {
       return tituloRepository.save(titulo);
    }

    public Optional<Filme> findById(Long id) {
        return tituloRepository.findById(id);
    }

    public List<Filme> findAll() {
        return tituloRepository.findAll();
    }
}
