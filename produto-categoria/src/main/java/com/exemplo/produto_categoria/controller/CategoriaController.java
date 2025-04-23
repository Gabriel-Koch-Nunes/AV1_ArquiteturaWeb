package com.exemplo.produto_categoria.controller;

import com.exemplo.produto_categoria.model.Categoria;
import com.exemplo.produto_categoria.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping("/{id}")
    public Categoria atualizar(@PathVariable Long id, @RequestBody Categoria categoriaAtualizada) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        categoria.setNome(categoriaAtualizada.getNome());
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }
}
