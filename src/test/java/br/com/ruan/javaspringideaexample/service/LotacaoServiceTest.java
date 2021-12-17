package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.LotacaoDto;
import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LotacaoServiceTest {

    @Autowired
    private LotacaoService service;

    @Test
    @DisplayName("deve salvar uma nova lotacao")
    void deveSalvarUmaNovaLotacao() {
        //cenario
        LotacaoDto dto = new LotacaoDto("Facem", TipoLotacao.ADMINISTRATIVO);
        //execucao
        Lotacao lotacaoSalva = service.salvar(dto);
        //verificacao
        Assertions.assertNotNull(lotacaoSalva.getId());
    }

    @Test
    @DisplayName("deve retonar uma lotacao")
    void deveRetornarUmaNovaLotacao() {
        //cenario
        LotacaoDto dto = new LotacaoDto("Facem", TipoLotacao.ADMINISTRATIVO);
        Lotacao lotacaoSalva = service.salvar(dto);
        //execucao
        Lotacao buscaLotacao = service.buscaPorDescricao(lotacaoSalva.getDescricao());
        //verificacao
        Assertions.assertNotNull(buscaLotacao.getId());
    }
}