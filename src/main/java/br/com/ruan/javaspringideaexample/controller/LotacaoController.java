package br.com.ruan.javaspringideaexample.controller;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.service.LotacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lotacao")
public class LotacaoController{

    final static String URI = "/lotacao";

    private final LotacaoService lotacaoService;

    public LotacaoController(LotacaoService lotacaoService) {
        this.lotacaoService = lotacaoService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Lotacao cadastrarLotacao(@RequestBody Lotacao lotacao){
        return lotacaoService.salvar(lotacao);
    }

    @GetMapping(value = "/{descricao}")
    @ResponseStatus(HttpStatus.OK)
    public Lotacao buscarPorDescricao(@PathVariable String descricao){
        return lotacaoService.buscaPorDescricao(descricao);
    }

}

