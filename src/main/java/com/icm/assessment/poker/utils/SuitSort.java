package com.icm.assessment.poker.utils;


import com.icm.assessment.poker.Card;

import java.util.Comparator;

public class SuitSort implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
