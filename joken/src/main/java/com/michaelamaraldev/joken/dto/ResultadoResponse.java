package com.michaelamaraldev.joken.dto;

import com.michaelamaraldev.joken.model.Jogada;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ResultadoResponse {

    private String resultadoRodada;
    private Jogada jogadaComputador;
    private int vitoriasJogador;
    private int vitoriasComputador;
    private boolean isFinalizado;
    private String resultadoFinal;

    public ResultadoResponse() {
    }

    public ResultadoResponse(String resultadoRodada, Jogada jogadaComputador, int vitoriasJogador, int vitoriasComputador, boolean isFinalizado, String resultadoFinal) {
        this.resultadoRodada = resultadoRodada;
        this.jogadaComputador = jogadaComputador;
        this.vitoriasJogador = vitoriasJogador;
        this.vitoriasComputador = vitoriasComputador;
        this.isFinalizado = isFinalizado;
        this.resultadoFinal = resultadoFinal;
    }

    public String getResultadoRodada() {
        return resultadoRodada;
    }

    public void setResultadoRodada(String resultadoRodada) {
        this.resultadoRodada = resultadoRodada;
    }

    public Jogada getJogadaComputador() {
        return jogadaComputador;
    }

    public void setJogadaComputador(Jogada jogadaComputador) {
        this.jogadaComputador = jogadaComputador;
    }

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public void setVitoriasJogador(int vitoriasJogador) {
        this.vitoriasJogador = vitoriasJogador;
    }

    public int getVitoriasComputador() {
        return vitoriasComputador;
    }

    public void setVitoriasComputador(int vitoriasComputador) {
        this.vitoriasComputador = vitoriasComputador;
    }

    public boolean isFinalizado() {
        return isFinalizado;
    }

    public void setFinalizado(boolean finalizado) {
        isFinalizado = finalizado;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }
}