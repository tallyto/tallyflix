package com.br.tallyflix.domain.controller;

import com.br.tallyflix.domain.entity.Filme;
import com.br.tallyflix.domain.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/titulos")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> listarFilmePorId(@PathVariable Long id) {
        Optional <Filme> filme = filmeService.findById(id);
        if (filme.isPresent()) {
            return ResponseEntity.ok(filme.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Filme> criarFilme(@RequestBody Filme filme) {
        filme = filmeService.save(filme);
        return ResponseEntity.status(201).body(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizarFilme(@PathVariable Long id, @RequestBody Filme filmeAtualizado) {
        Optional<Filme> filmeExistente = filmeService.findById(id);
        if (filmeExistente.isPresent()) {
            Filme filme = filmeExistente.get();
            filme.setTitulo(filmeAtualizado.getTitulo());
            filme = filmeService.save(filme);
            return ResponseEntity.ok(filme);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
