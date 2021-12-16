package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Set;

@SpringBootTest
public class ServidorServiceTest {

    @Autowired
    private ServidorService servidorService;

    @Test
    @DisplayName("deve retonar um Servidor")
    void deveRetornarUmNovoServidor() {
        //cenario

        Lotacao lot1 = new Lotacao(null,"aaaa", LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO );
        Servidor serv1 = new Servidor(null,"bbbb","ccc",LocalDateTime.now(),null);
        Servidor servidorSalva = servidorService.salvar(serv1);
        //execucao

        Servidor buscaServidor = servidorService.buscaPorMatricula(servidorSalva.getMatricula());
        //verificacao
        Assertions.assertNotNull(buscaServidor.getId());

    }
}
