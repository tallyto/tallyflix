package com.br.tallyflix.domain.service;

import com.br.tallyflix.domain.entity.Titulo;
import com.br.tallyflix.domain.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TituloService {
    @Autowired
    private TituloRepository tituloRepository;

    public void deleteById(Long id) {
        tituloRepository.deleteById(id);
    }

    public Titulo save(Titulo titulo) {
       return tituloRepository.save(titulo);
    }

    public Optional<Titulo> findById(Long id) {
        return tituloRepository.findById(id);
    }

    public List<Titulo> findAll() {
        return tituloRepository.findAll();
    }
}
