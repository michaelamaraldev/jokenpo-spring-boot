package com.michaelamaraldev.joken.model;

import java.util.Random;

public class Game {
    private Player jogador;
    private Player computador;

    private int vitoriasJogador = 0;
    private int vitoriasComputador = 0;

    private boolean isFinalizado = false;

    public Game(String nomeJogador) {
        this.jogador = new Player(nomeJogador);
        this.computador = new Player("Computador");
    }

    public void setJogadaJogador(Jogada jogada) {
        jogador.escolherJogada(jogada);
    }

    public void jogadaComputador() {
        Jogada[] valores = Jogada.values();
        Jogada jogadaRandom = valores[new Random().nextInt(valores.length)];
        computador.escolherJogada(jogadaRandom);
    }

    public String resultado() {
        Jogada jogadaUsuario = jogador.getJogada();
        Jogada jogadaPC = computador.getJogada();

        if (jogadaUsuario == null) {
            return "Escolha uma jogada primeiro.";
        }

        isFinalizado = true;

        if (jogadaUsuario == jogadaPC) {
            return "Empate!";
        } else if (jogadaUsuario.venceDe(jogadaPC)) {
            vitoriasJogador++;
            return jogador.getNome() + " venceu!!";
        } else {
            vitoriasComputador++;
            return computador.getNome() + " venceu!!";
        }
    }

    public int getVitoriasComputador() {
        return vitoriasComputador;
    }

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public boolean isFinalizado() {
        return isFinalizado;
    }

    public Jogada getJogadaComputador() {
        return computador.getJogada();
    }

    public void novaRodada() {
        isFinalizado = false;
        jogador.escolherJogada(null);
        computador.escolherJogada(null);
    }
}