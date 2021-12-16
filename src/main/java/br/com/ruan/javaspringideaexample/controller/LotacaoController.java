package br.com.ruan.javaspringideaexample.controller;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.service.LotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lotacao")
class LotacaoController {

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
}

