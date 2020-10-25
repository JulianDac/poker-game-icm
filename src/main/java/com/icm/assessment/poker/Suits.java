package com.icm.assessment.poker;

public enum Suits {
    SPADES("S", 1),
    CLUBS("C", 2),
    DIAMONDS("D", 3),
    HEARTS("H", 4),
    INVALID("I", -1);

    private String type;
    private int suitRank;

    Suits(String type, int suitRank) {
        this.type = type;
        this.suitRank = suitRank;
    }

    public String getType() {
        return type;
    }

    public int getSuitRank() {
        return suitRank;
    }

    public static Suits fromCode(String str) {
        for (Suits val : Suits.values()) {
            if (str.equals(val.getType())) {
                return val;
            }
        }
        return INVALID;
    }
}
