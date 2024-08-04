package com.tardisgallifrey.cards;

import java.util.ArrayList;
import java.util.Random;

public class Card {

    private final String suit;
    private final String name;
    private final int rank;

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

    public String getSuit() {
        return suit;
    }

    //Create a new deck of cards
    public static ArrayList<Card> createDeck(){
        Card card;
        ArrayList<Card> deck = new ArrayList<>(52);

        String[] suit = {"H", "D", "S", "C"};
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
        for(int num = 0; num < 4; num++ ){
            for(int posNum = 0; posNum < 12; posNum++) {
                deck.add(new Card(suit[num], name[posNum], num + 2));
            }
        }

        return deck;
    }

    public static ArrayList<Card> shuffleDeck(ArrayList<Card> deck){
        Random rand = new Random();
        ArrayList<Card> newDeck = new ArrayList<>();
        for(int i = 0; i < deck.size(); i ++){
            int randIndex = rand.nextInt(deck.size() - i);
            newDeck.add(deck.get(randIndex));
            deck.remove(randIndex);
        }

        return newDeck;
    }
}
