package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.ServidorCadastroDto;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServidorServiceTest {

    @Autowired
    private ServidorService servidorService;

    @Test
    @DisplayName("deve salvar um novo Servidor")
    void deveSalvarUmNovoServidor() {
        //cenario
        ServidorCadastroDto dto = new ServidorCadastroDto("bbbb",null);
        //execucao
        Servidor servidorSalva = servidorService.salvar(dto);
        //verificacao
        Assertions.assertNotNull(servidorSalva.getId());
    }

    @Test
    @DisplayName("deve retonar um Servidor")
    void deveRetornarUmNovoServidor() {
        //cenario
        ServidorCadastroDto dto = new ServidorCadastroDto("bbbb",null);
        Servidor servidorSalva = servidorService.salvar(dto);
        //execucao
        Servidor buscaServidor = servidorService.buscaPorMatricula(servidorSalva.getMatricula());
        //verificacao
        Assertions.assertNotNull(buscaServidor.getId());
    }
}
