package com.exemplo.produto_categoria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.exemplo.produto_categoria.model.Categoria;
import com.exemplo.produto_categoria.repository.CategoriaRepository;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    
        public CategoriaService(CategoriaRepository categoriaRepository) {
            this.categoriaRepository = categoriaRepository;
        }

        public List<Categoria> listar() {
            return categoriaRepository.findAll();
        }

        public Optional<Categoria> buscarPorId(Long id) {
            return categoriaRepository.findById(id);
        }

        public Categoria salvar(Categoria categoria) {
            return categoriaRepository.save(categoria);
        }

        public Categoria atualizar(Long id, Categoria categoria) {
            if (categoriaRepository.existsById(id)) {
                categoria.setId(id);
                return categoriaRepository.save(categoria);
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada");
            }
        }

        public void deletar(Long id) {
            categoriaRepository.deleteById(id);
        }
}