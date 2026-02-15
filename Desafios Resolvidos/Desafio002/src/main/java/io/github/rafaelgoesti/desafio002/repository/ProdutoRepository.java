package io.github.rafaelgoesti.desafio002.repository;

import io.github.rafaelgoesti.desafio002.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByNomeProduto(String nome);
}
