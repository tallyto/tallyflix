package com.br.tallyflix.domain.service;

import com.br.tallyflix.domain.entity.Plano;
import com.br.tallyflix.domain.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository planoRepository;

    public List<Plano> findAll() {
        return planoRepository.findAll();
    }

    public Optional<Plano> findById(Long id) {
        return planoRepository.findById(id);
    }

    public Plano save(Plano plano) {
        return planoRepository.save(plano);
    }

    public void deleteById(Long id) {
        planoRepository.deleteById(id);
    }

}
