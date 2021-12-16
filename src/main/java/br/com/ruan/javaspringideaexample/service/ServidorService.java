package br.com.ruan.javaspringideaexample.service;

import br.com.ruan.javaspringideaexample.entities.Servidor;
import br.com.ruan.javaspringideaexample.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServidorService {

    @Autowired
    private final ServidorRepository repository;

    public ServidorService(ServidorRepository repository){
        this.repository = repository;
    }
    public Servidor salvar(Servidor novoServidor){
        Servidor servidorSalva = repository.save(novoServidor);
        return servidorSalva;
    }
    public Servidor buscaPorMatricula(String matricula){
        Optional<Servidor> servidorBuscada =repository.findByMatricula(matricula);
        return servidorBuscada.get();
    }

}
