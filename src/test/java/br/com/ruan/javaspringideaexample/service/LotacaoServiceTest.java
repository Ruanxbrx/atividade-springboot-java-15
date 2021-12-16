package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;

@SpringBootTest
public class LotacaoServiceTest {

    @Autowired
    private LotacaoService service;

    @Test
    @DisplayName("deve salvar uma nova lotacao")
    void deveSalvarUmaNovaLotacao() {
        //cenario
        Lotacao lot1 = new Lotacao(null,"aaaa", LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO );
        //execucao
        Lotacao lotacaoSalva = service.salvar(lot1);
        //verificacao
        Assertions.assertNotNull(lotacaoSalva.getId());

    }
    @Test
    @DisplayName("deve retonar uma lotacao")
    void deveRetornarUmaNovaLotacao() {
        //cenario
        Lotacao lot1 = new Lotacao(null,"aaaa", LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO );
        Lotacao lotacaoSalva = service.salvar(lot1);
        //execucao
        Lotacao buscaLotacao = service.buscaPorID(lotacaoSalva.getId());
        //verificacao
        Assertions.assertNotNull(buscaLotacao.getId());
        buscaLotacao.getId();

    }


}