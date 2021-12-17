package br.com.ruan.javaspringideaexample.controller.dto;


import br.com.ruan.javaspringideaexample.entities.TipoLotacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LotacaoDto {

    @NotBlank(message = "Obrigatorio descricao da lotacao")
    @Size(max = 200, message = "Limite de 200 caracteres")
    String descricao;

    @NotNull(message = "Obrigatorio tipo da lotacao")
    TipoLotacao tipoLotacao;

    public LotacaoDto(String descricao, TipoLotacao tipoLotacao) {
        this.descricao = descricao;
        this.tipoLotacao = tipoLotacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoLotacao getTipoLotacao() {
        return tipoLotacao;
    }
}

