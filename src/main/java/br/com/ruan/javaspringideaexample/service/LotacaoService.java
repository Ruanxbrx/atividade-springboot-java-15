package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.controller.dto.LotacaoDto;
import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.repository.LotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class LotacaoService {

    @Autowired
    private final LotacaoRepository repository;

    public LotacaoService(LotacaoRepository repository) {
        this.repository = repository;
    }

    public Lotacao salvar(LotacaoDto lotacaoDto){
        Lotacao lotacao = new Lotacao(lotacaoDto.getDescricao(), LocalDateTime.now(),lotacaoDto.getTipoLotacao());
        return repository.save(lotacao);
    }
    public Lotacao buscaPorDescricao(String descricao){
        Optional<Lotacao> lotacaoBuscada = repository.findByDescricao(descricao);
        return lotacaoBuscada.get();
    }
    public List<Lotacao> buscarPorTodosIds(List<Long> ids){
        return repository.findAllById(ids);
    }
}
