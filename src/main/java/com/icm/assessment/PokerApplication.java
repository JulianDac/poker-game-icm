package com.icm.assessment;
import com.icm.assessment.poker.Game;
import com.icm.assessment.poker.utils.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PokerApplication {

    public static void main(String... arg) {
        try {
            List<Game> gamesPlayed = parsePokerHands();
            Long gamesWonByPlayer1 = printWinningHandCount(gamesPlayed);

            System.out.println(String.format("Number of Games: %d", gamesPlayed.size()));
            System.out.println(String.format("Player 1 won %d hands", gamesWonByPlayer1));
            System.out.println(String.format("Player 2 won %d hands", (gamesPlayed.size() - gamesWonByPlayer1)));

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Game> parsePokerHands() throws AssertionError {
        Scanner inputScanner = new Scanner(System.in);
        List<Game> gamesPlayed = new ArrayList<>();

        while (inputScanner.hasNext()) {
            String readLine = inputScanner.nextLine();
            String[] numberOfCards = readLine.split(" ");
            assert numberOfCards.length == 10 : String.format("Invalid number of Cards in %s", readLine);
            gamesPlayed.add(Utilities.parsePlayerCards(readLine));
        }
        inputScanner.close();

        return gamesPlayed;
    }

    public static Long printWinningHandCount(List<Game> games) {
        Predicate<Game> predicate = game -> game.getWinner().getPlayerId() == 1;
        Long gamesWonByPlayer1 = games.stream().filter(predicate).count();
        return gamesWonByPlayer1;
    }
}
