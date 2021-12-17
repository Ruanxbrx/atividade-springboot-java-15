package br.com.ruan.javaspringideaexample.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String matricula;
    private LocalDateTime dataCadastro;
    @ManyToMany
    private Set<Lotacao> lotacoes;

    public Servidor() {
    }

    public Servidor(Long id, String nome, String matricula, LocalDateTime dataCadastro, Set<Lotacao> lotacoes) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = dataCadastro;
        this.lotacoes = lotacoes;
    }

    public Servidor(String nome, LocalDateTime dataCadastro, Set<Lotacao> lotacoes) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.lotacoes = lotacoes;
    }

    public Servidor(String nome, LocalDateTime dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getData_cadastro() {
        return dataCadastro;
    }

    public Set<Lotacao> getLotacoes() {
        return lotacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Servidor)) return false;
        Servidor servidor = (Servidor) o;
        return getId().equals(servidor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}