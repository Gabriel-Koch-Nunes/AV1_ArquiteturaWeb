package com.exemplo.produto_categoria.repository;

import com.exemplo.produto_categoria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

