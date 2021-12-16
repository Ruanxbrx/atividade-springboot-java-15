package br.com.ruan.javaspringideaexample.repository;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao,Long> {
    Optional<Lotacao> findByDescricao(String descricao);
}
