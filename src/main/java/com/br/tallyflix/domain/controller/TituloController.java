package com.br.tallyflix.domain.controller;

import com.br.tallyflix.domain.entity.Titulo;
import com.br.tallyflix.domain.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/titulos")
public class TituloController {
    @Autowired
    private TituloService tituloService;

    @GetMapping
    public List<Titulo> listarTitulos() {
        return tituloService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Titulo> listarTituloPorId(@PathVariable Long id) {
        Optional <Titulo> titulo = tituloService.findById(id);
        if (titulo.isPresent()) {
            return ResponseEntity.ok(titulo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Titulo> criarTitulo(@RequestBody Titulo titulo) {
        titulo = tituloService.save(titulo);
        return ResponseEntity.status(201).body(titulo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Titulo> atualizarTitulo(@PathVariable Long id, @RequestBody Titulo tituloAtualizado) {
        Optional<Titulo> tituloExistente = tituloService.findById(id);
        if (tituloExistente.isPresent()) {
            Titulo titulo = tituloExistente.get();
            titulo.setNome(tituloAtualizado.getNome());
            titulo = tituloService.save(titulo);
            return ResponseEntity.ok(titulo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
