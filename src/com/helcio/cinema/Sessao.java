package com.helcio.cinema;

public class Sessao {
    private Long id;
    private Long cinemaId;
    private Integer horaInicio;
    private Integer duracao;
    // Todo: Implementar classe Filme
    // private Filme filme

    public Sessao() {
    }

    public Sessao(Long id, Long cinemaId, Integer horaInicio, Integer horaTermino) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.horaInicio = horaInicio;
        this.duracao = horaTermino;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", cinemaId=" + cinemaId +
                ", horaInicio=" + horaInicio +
                ", horaTermino=" + duracao +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}
