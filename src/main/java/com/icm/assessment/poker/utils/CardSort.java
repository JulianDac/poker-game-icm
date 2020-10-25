package com.icm.assessment.poker.utils;
import com.icm.assessment.poker.Card;
import java.util.Comparator;

public class CardSort implements Comparator<Card> {
    @Override
    public int compare(Card firstCard, Card secondCard) {
        return firstCard.getRank().compareTo(secondCard.getRank());
    }
}
