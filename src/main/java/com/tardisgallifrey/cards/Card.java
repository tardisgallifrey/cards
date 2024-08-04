package com.tardisgallifrey.cards;

public class Card {

    private final String suit;
    private final String name;
    private final int rank;


    public String getSuit() {
        return suit;
    }

    public Card(String suit, String name, int rank){
        this.suit = suit;
        this.name = name;
        this.rank = rank;
    }


    public String getName() {
        return name;
    }


    public int getRank() {
        return rank;
    }


}
