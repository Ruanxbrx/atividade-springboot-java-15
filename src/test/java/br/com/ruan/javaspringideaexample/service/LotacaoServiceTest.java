package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.LotacaoDto;
import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import br.com.ruan.javaspringideaexample.repository.LotacaoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class LotacaoServiceTest {

    @InjectMocks
    private LotacaoService service;

    @Mock
    private LotacaoRepository repository;

    @Test
    @DisplayName("deve salvar uma nova lotacao")
    void deveSalvarUmaNovaLotacao() {
        //cenario
        LotacaoDto dto = new LotacaoDto("Facem", TipoLotacao.ADMINISTRATIVO);
        Lotacao lotacao = new Lotacao(1L, "Facem", LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO);
        when(repository.save(any())).thenReturn(lotacao);
        //execucao
        Lotacao lotacaoSalva = service.salvar(dto);
        //verificacao
        assertEquals(lotacaoSalva, lotacao);
    }

    @Test
    @DisplayName("deve retonar uma lotacao")
    void deveRetornarUmaNovaLotacao() {
        //cenario
        LotacaoDto dto = new LotacaoDto("Facem", TipoLotacao.ADMINISTRATIVO);
        Lotacao lotacao = new Lotacao(1L, "Facem", LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO);
        when(repository.save(any())).thenReturn(lotacao);
        when(repository.findByDescricao("Facem")).thenReturn(Optional.of(lotacao));
        Lotacao lotacaoSalva = service.salvar(dto);
        //execucao
        Lotacao buscaLotacao = service.buscaPorDescricao("Facem");
        //verificacao
        assertEquals(buscaLotacao, lotacao);
    }

}