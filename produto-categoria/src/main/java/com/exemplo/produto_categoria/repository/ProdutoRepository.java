package com.exemplo.produto_categoria.repository;

import com.exemplo.produto_categoria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}