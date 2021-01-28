package com.atividade.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);


}
