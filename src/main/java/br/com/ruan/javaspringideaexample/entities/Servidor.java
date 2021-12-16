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
    private Set<Lotacao> lotacao;

    public Servidor() {
    }

    public Servidor(Long id, String nome, String matricula, LocalDateTime data_cadastro, Set<Lotacao> lotacao) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = data_cadastro;
        this.lotacao = lotacao;
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

    public LocalDateTime getData_cadastro() {
        return dataCadastro;
    }

    public Set<Lotacao> getLotacao() {
        return lotacao;
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