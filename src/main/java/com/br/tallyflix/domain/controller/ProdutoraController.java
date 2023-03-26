package com.br.tallyflix.domain.controller;

import com.br.tallyflix.domain.entity.Produtora;
import com.br.tallyflix.domain.service.ProdutoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtoras")
public class ProdutoraController {
    @Autowired
    private ProdutoraService produtoraService;

    @GetMapping
    public List<Produtora> listarProdutoras() {
        return produtoraService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtora> listarProdutoraPorId(@PathVariable Long id) {
        Optional<Produtora> produtora = produtoraService.findById(id);
        if (produtora.isPresent()) {
            return ResponseEntity.ok(produtora.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Produtora> criarProdutora(@RequestBody Produtora produtora) {
        produtora = produtoraService.save(produtora);
        return ResponseEntity.status(201).body(produtora);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produtora> atualizarProdutora(@PathVariable Long id, @RequestBody Produtora produtoraAtualizada) {
        Optional<Produtora> produtoraExistente = produtoraService.findById(id);
        if (produtoraExistente.isPresent()) {
            Produtora produtora = produtoraExistente.get();
            produtora.setNome(produtoraAtualizada.getNome());
            produtora = produtoraService.save(produtora);
            return ResponseEntity.ok(produtora);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirProdutora(@PathVariable Long id) {
        Optional<Produtora> produtora = produtoraService.findById(id);
        if (produtora.isPresent()) {
            produtoraService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
