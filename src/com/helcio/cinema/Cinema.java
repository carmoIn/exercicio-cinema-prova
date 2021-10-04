package com.helcio.cinema;

import java.util.ArrayList;

public class Cinema {
    private Long id;
    private String nome;
    private Integer horaAbertura;
    private Integer horaFechamento;
    private ArrayList<Sessao> sessoes;

    public Cinema() {
    }

    public Cinema(Long id, String nome, Integer horaAbertura, Integer horaFechamento, ArrayList<Sessao> sessoes) {
        this.id = id;
        this.nome = nome;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", horaAbertura=" + horaAbertura +
                ", horaFechamento=" + horaFechamento +
                ", sessoes=" + sessoes +
                '}';
    }

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

    public Integer getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(Integer horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public Integer getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(Integer horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(ArrayList<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
