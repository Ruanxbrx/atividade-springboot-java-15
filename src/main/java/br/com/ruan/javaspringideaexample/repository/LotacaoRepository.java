package br.com.ruan.javaspringideaexample.repository;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao,Long> {
}
