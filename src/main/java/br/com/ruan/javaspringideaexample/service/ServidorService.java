package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.ServidorCadastroDto;
import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.repository.ServidorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ServidorService {

    final static String PREFIXO_MATRICULA = "MAT";

    private final ServidorRepository repository;
    private final LotacaoService lotacaoService;

    public ServidorService(ServidorRepository repository, LotacaoService lotacaoService) {
        this.repository = repository;
        this.lotacaoService = lotacaoService;
    }

    @Transactional
    public Servidor salvar(ServidorCadastroDto servidorDto){

        Servidor servidor;

        if (servidorDto.getLotacoes() != null) {
            Set<Lotacao> lotacoes = new HashSet<>(lotacaoService.buscarPorTodosIds(servidorDto.getLotacoes()));
            servidor = new Servidor(servidorDto.getName(), LocalDateTime.now(), lotacoes);
        } else {
            servidor = new Servidor(servidorDto.getName(), LocalDateTime.now());
        }

        repository.save(servidor);
        servidor.setMatricula(PREFIXO_MATRICULA + servidor.getId());
        return repository.save(servidor);
    }
    public Servidor buscaPorMatricula(String matricula){
        Optional<Servidor> servidorBuscada = repository.findByMatricula(matricula);
        return servidorBuscada.get();
    }

}
