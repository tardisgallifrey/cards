package com.tardisgallifrey.cards;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Card> deck = Card.createDeck();
        ArrayList<Card> deck2 = Card.shuffleDeck(deck);

        for(Card token : deck2){
            System.out.println(token.getName()+token.getSuit());
        }

    }
}