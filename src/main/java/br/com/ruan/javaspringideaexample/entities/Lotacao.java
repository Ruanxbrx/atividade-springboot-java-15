package br.com.ruan.javaspringideaexample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Lotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private LocalDateTime dataLotacaoCadastro;
    private TipoLotacao tipoLotacao;

    public Lotacao() {
    }

    public Lotacao(Long id, String descricao, LocalDateTime dataLotacaoCadastro, TipoLotacao tipoLotacao) {
        this.id = id;
        this.descricao = descricao;
        this.dataLotacaoCadastro = dataLotacaoCadastro;
        this.tipoLotacao = tipoLotacao;
    }


    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataLotacaoCadastro() {
        return dataLotacaoCadastro;
    }

    public TipoLotacao getTipoLotacao() {
        return tipoLotacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lotacao)) return false;
        Lotacao lotacao = (Lotacao) o;
        return getId().equals(lotacao.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
