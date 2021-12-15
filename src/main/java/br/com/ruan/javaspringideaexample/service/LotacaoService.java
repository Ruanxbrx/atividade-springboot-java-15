package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import org.springframework.stereotype.Service;
import br.com.ruan.javaspringideaexample.repository.LotacaoRepository;

@Service
public class LotacaoService {
    private final LotacaoRepository repository;

    public LotacaoService(LotacaoRepository repository) {
        this.repository = repository;
    }
    public Lotacao salvar(Lotacao novaLotacao){
        Lotacao lotacaoSalva = repository.save(novaLotacao);
        return lotacaoSalva;
    }
    public Lotacao buscaPorID(Long id){
        Lotacao lotacaoBuscada = repository.getById();
        return lotacaoBuscada;
    }
}
