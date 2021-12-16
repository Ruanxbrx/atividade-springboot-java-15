package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Servidor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class ServidorServiceTest {

    @Autowired
    private ServidorService servidorService;

    @Test
    @DisplayName("deve salvar um novo Servidor")
    void deveSalvarUmNovoServidor() {
        //cenario
        Servidor serv1 = new Servidor(null,"bbbb","ccc",LocalDateTime.now(),null);
        //execucao
        Servidor servidorSalva = servidorService.salvar(serv1);
        //verificacao
        Assertions.assertNotNull(servidorSalva.getId());
    }

    @Test
    @DisplayName("deve retonar um Servidor")
    void deveRetornarUmNovoServidor() {
        //cenario
        Servidor serv1 = new Servidor(null,"bbbb","ccc",LocalDateTime.now(),null);
        Servidor servidorSalva = servidorService.salvar(serv1);
        //execucao
        Servidor buscaServidor = servidorService.buscaPorMatricula(servidorSalva.getMatricula());
        //verificacao
        Assertions.assertNotNull(buscaServidor.getId());
    }
}
