package com.michaelamaraldev.joken.controller;

import com.michaelamaraldev.joken.dto.JogadaRequest;
import com.michaelamaraldev.joken.dto.ResultadoResponse;
import com.michaelamaraldev.joken.model.Game;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private Game game;

    @PostMapping("/start")
    public String startGame(@RequestParam String nomeJogador) {
        game = new Game(nomeJogador);
        return "Jogo iniciado para " + nomeJogador + "!";
    }

    @PostMapping("/jogada")
    public ResultadoResponse fazerJogada(@RequestBody JogadaRequest request) {
        if (game == null) {
            throw new IllegalStateException("Inicie o jogo primeiro!");
        }

        game.setJogadaJogador(request.getJogada());
        game.jogadaComputador();
        String resultado = game.resultado();

        return new ResultadoResponse(
            resultado,
            game.getJogadaComputador(),
            game.getVitoriasJogador(),
            game.getVitoriasComputador(),
            game.isFinalizado(),
            null
        );
    }

    @PostMapping("/nova-rodada")
    public String novaRodada() {
        if (game == null) {
            throw new IllegalStateException("Inicie o jogo primeiro!");
        }
        game.novaRodada();
        return "Nova rodada iniciada!";
    }

    @GetMapping("/status")
    public String getStatus() {
        if (game == null) {
            return "Nenhum jogo em andamento";
        }
        return String.format("Jogador: %d vitórias | Computador: %d vitórias", 
            game.getVitoriasJogador(), game.getVitoriasComputador());
    }
}