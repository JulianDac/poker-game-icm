package com.icm.assessment.poker;

import java.util.Arrays;

public final class Card {

    private final static Suits[] SUITS = {Suits.DIAMONDS, Suits.SPADES, Suits.CLUBS, Suits.HEARTS};
    private final Integer rank;
    private final Suits suit;

    //Assign an integer ranking to each card
    private Card(String card) throws IllegalArgumentException {
        suit = Suits.fromCode(Character.toString(card.charAt(card.length() - 1)));
        String str = card.substring(0, card.length() - 1);

        if (Character.isDigit(str.charAt(0))) {
            rank = Integer.parseInt(str);
        } else {
            switch (str.charAt(0)) {
                case 'T':
                    rank = 10;
                    break;
                case 'J':
                    rank = 11;
                    break;
                case 'Q':
                    rank = 12;
                    break;
                case 'K':
                    rank = 13;
                    break;
                case 'A':
                    rank = 14;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Card " + card);
            }
        }

        if (!Arrays.stream(SUITS).anyMatch(suit::equals)) {
            throw new IllegalArgumentException("Invalid Card " + card);
        }

        if (rank > 14) {
            throw new IllegalArgumentException("Invalid Card " + card);
        }
    }

    public static Card build(String card) {
        return new Card(card);
    }

    public Integer getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }
}
