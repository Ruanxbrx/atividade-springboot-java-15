package br.com.ruan.javaspringideaexample.repository;

import br.com.ruan.javaspringideaexample.entities.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor,Long> {

}
