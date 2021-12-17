package br.com.ruan.javaspringideaexample.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class ServidorCadastroDto {
    @NotBlank(message = "Obrigatorio nome do servidor")
    @Size(max = 400, message = "Limite de 400 caracteres")
    String name;

    List<Long> lotacoes;

    public ServidorCadastroDto(String name, List<Long> idLotacoes) {
        this.name = name;
        this.lotacoes = idLotacoes;
    }

    public String getName() {
        return name;
    }

    public List<Long> getLotacoes() {
        return lotacoes;
    }
}
