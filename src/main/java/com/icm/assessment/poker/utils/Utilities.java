package com.icm.assessment.poker.utils;
import com.icm.assessment.poker.Game;
import java.util.stream.IntStream;

public class Utilities {

    public static Game parsePlayerCards(String gamePlayed) {

        String[] hands = gamePlayed.split(" ");

        String[] player1 = IntStream.range(0, 5)
                .mapToObj(i -> hands[i])
                .toArray(String[]::new);

        String[] player2 = IntStream.range(5, 10)
                .mapToObj(i -> hands[i])
                .toArray(String[]::new);

        Game game = Game.build(player1, player2);
        return game;
    }


}
