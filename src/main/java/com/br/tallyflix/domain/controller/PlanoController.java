package com.br.tallyflix.domain.controller;

import com.br.tallyflix.domain.entity.Plano;
import com.br.tallyflix.domain.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/planos")
public class PlanoController {
    @Autowired
    private PlanoService planoService;

    @GetMapping
    public List<Plano> listarPlanos() {
        return planoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> buscarPlanoPorId(@PathVariable Long id) {
        Optional<Plano> plano = planoService.findById(id);
        if (plano.isPresent()) {
            return ResponseEntity.ok(plano.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Plano> criarPlano(@RequestBody Plano plano) {
        plano = planoService.save(plano);
        return ResponseEntity.status(HttpStatus.CREATED).body(plano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> atualizarPlano(@PathVariable Long id, @RequestBody Plano planoAtualizado) {
        Optional<Plano> planoExistente = planoService.findById(id);
        if (planoExistente.isPresent()) {
            Plano plano = planoExistente.get();
            plano.setNome(planoAtualizado.getNome());
            plano.setPreco(planoAtualizado.getPreco());
            plano.setDuracaoEmMeses(planoAtualizado.getDuracaoEmMeses());
            plano = planoService.save(plano);
            return ResponseEntity.ok(plano);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPlano(@PathVariable Long id) {
        Optional<Plano> plano = planoService.findById(id);
        if (plano.isPresent()) {
            planoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
