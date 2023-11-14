package br.com.praticonet.java.android.thread.model.dto;

import java.util.Date;

public class Produto {
    private Long id;
    private String nome;
    private Double preço;
    private Date dataHoraCadastro;
    private Date dataHoraUltimaAlteração;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Date getDataHoraUltimaAlteração() {
        return dataHoraUltimaAlteração;
    }

    public void setDataHoraUltimaAlteração(Date dataHoraUltimaAlteração) {
        this.dataHoraUltimaAlteração = dataHoraUltimaAlteração;
    }
}
