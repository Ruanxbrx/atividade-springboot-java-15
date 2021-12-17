package br.com.ruan.javaspringideaexample.controller;

import br.com.ruan.javaspringideaexample.controller.dto.ServidorCadastroDto;
import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.service.ServidorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/servidor")
public class ServidorController {
    final static String URI = "/servidor";
    private final ServidorService servidorService;
    public ServidorController(ServidorService servidorService) {
        this.servidorService = servidorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Servidor cadastrarServidor(@RequestBody @Valid ServidorCadastroDto servidorDto){
        return servidorService.salvar(servidorDto);
    }

    @GetMapping(value = "/{matricula}")
    @ResponseStatus(HttpStatus.OK)
    public Servidor buscarPorMatricula(@PathVariable String matricula){
        return servidorService.buscaPorMatricula(matricula);
    }
}
