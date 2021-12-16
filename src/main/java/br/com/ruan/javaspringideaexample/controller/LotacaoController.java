package br.com.ruan.javaspringideaexample.controller;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.service.LotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lotacao")
public class LotacaoController{

    @Autowired
    private final LotacaoService lotacaoService;

    public LotacaoController(LotacaoService lotacaoService) {
        this.lotacaoService = lotacaoService;
    }


    @GetMapping
    public ResponseEntity<Lotacao> cadastrarLotacao(@RequestBody Lotacao lotacao){
        Lotacao lotacaoSalva = lotacaoService.salvar(lotacao);
        return ResponseEntity.ok().body(lotacaoSalva);
    }
    @GetMapping(value = "/{descricao}")
    public ResponseEntity<Lotacao> buscarPorNome(@PathVariable String descricao){
        Lotacao lotacaoBuscada = lotacaoService.buscaPorDescricao(descricao);
        return ResponseEntity.ok(lotacaoBuscada);
    }

}

