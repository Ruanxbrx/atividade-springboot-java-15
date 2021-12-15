package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class LotacaoServiceTest {

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


}