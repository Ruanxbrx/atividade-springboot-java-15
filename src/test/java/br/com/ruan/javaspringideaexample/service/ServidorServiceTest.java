package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.ServidorCadastroDto;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.repository.ServidorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ServidorServiceTest {

    @InjectMocks
    private ServidorService servidorService;

    @Mock
    private ServidorRepository repository;

    @Test
    @DisplayName("deve salvar um novo Servidor")
    void deveSalvarUmNovoServidor() {
        //cenario
        ServidorCadastroDto dto = new ServidorCadastroDto("bbbb",null);
        Servidor servidor = new Servidor(1L,"bbbb","Mat1",LocalDateTime.now(),null );
        when(repository.save(any())).thenReturn(servidor);
        //execucao
        Servidor servidorSalva = servidorService.salvar(dto);
        //verificacao
        assertEquals(servidorSalva, servidor);
    }

    @Test
    @DisplayName("deve retonar um Servidor")
    void deveRetornarUmNovoServidor() {
        //cenario
        ServidorCadastroDto dto = new ServidorCadastroDto("bbbb",null);
        Servidor servidor = new Servidor(1L,"bbbb","Mat1",LocalDateTime.now(),null );
        when(repository.save(any())).thenReturn(servidor);
        when(repository.findByMatricula("Mat1")).thenReturn(java.util.Optional.of(servidor));
        Servidor servidorSalva = servidorService.salvar(dto);
        //execucao
        Servidor buscaServidor = servidorService.buscaPorMatricula(servidorSalva.getMatricula());
        //verificacao
        assertEquals(buscaServidor, servidor);
    }
}
