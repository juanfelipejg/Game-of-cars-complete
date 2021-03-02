package com.example.juegoCarros.assembler;

import com.example.juegoCarros.entities.Game;
import com.example.juegoCarros.entities.Podium;
import com.example.juegoCarros.models.GameModel;
import com.example.juegoCarros.models.PodiumModel;
import com.example.juegoCarros.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Assembler {

    @Autowired
    PlayerRepository playerRepository;

    public static Game makeGame (GameModel gameModel){
        Game game = new Game();
        game.setId(gameModel.getId());
        game.setNumberOfPlayers(gameModel.getNumberOfPlayers());
        game.setDistance(gameModel.getDistance());

        return game;
    }

    public static GameModel makeGameModel (Game game){
        GameModel gameModel = new GameModel();

        gameModel.setId(game.getId());
        gameModel.setNumberOfPlayers(game.getNumberOfPlayers());
        gameModel.setDistance(game.getDistance());

        return gameModel;
    }

    public static Podium makePodium(PodiumModel podiumModel){

        Podium podium = new Podium();
        podium.setId(podiumModel.getId());

        return podium;
    }

    public static PodiumModel makePodiumModel(Podium podium){
        PodiumModel podiumModel = new PodiumModel();

        podiumModel.setId(podium.getId());
        podiumModel.setFirstPlayerId(podium.getFirstPlace().getId());
        podiumModel.setSecondPlayerId(podium.getSecondPlace().getId());
        podiumModel.setThirdPlayerId(podium.getThirdPlace().getId());

        return podiumModel;

    }
}
