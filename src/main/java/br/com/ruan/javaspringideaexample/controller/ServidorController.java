package br.com.ruan.javaspringideaexample.controller;

import br.com.ruan.javaspringideaexample.entities.Lotacao;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.entities.TipoLotacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashSet;

@RestController
@RequestMapping(value = "/servidor")
public class ServidorController {
    @GetMapping
    public ResponseEntity<Servidor> findAll(){
        var listaLotacao = new HashSet<Lotacao>();
        listaLotacao.add(new Lotacao(1L,"aaaa",LocalDateTime.now(), TipoLotacao.ADMINISTRATIVO));
        listaLotacao.add(new Lotacao(2L,"baaa",LocalDateTime.now(), TipoLotacao.DEPOSITO));
        Servidor u = new Servidor(1L,"ruan","mat01",LocalDateTime.now(),listaLotacao);
        return ResponseEntity.ok().body(u);
    }
}

