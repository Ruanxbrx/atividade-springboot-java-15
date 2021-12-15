package entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class Servidor implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String matricula;
    private LocalDateTime data_cadastro;
    //private Lotacao lotacao;

    public Servidor() {
    }

    public Servidor(Long id, String nome, String matricula, LocalDateTime data_cadastro /*,Lotacao lotacao*/) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.data_cadastro = data_cadastro;
        //this.lotacao = lotacao;
    }

    public Servidor(Long i, String ruan, Long i1, LocalDateTime now) {
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
        return data_cadastro;
    }

    //public Lotacao getLotacao() {
       // return lotacao;
    //}

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    //public void setLotacao(Lotacao lotacao) {
        //this.lotacao = lotacao;
    //}

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