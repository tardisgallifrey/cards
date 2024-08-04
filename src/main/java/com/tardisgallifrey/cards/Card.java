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
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for(int num = 0; num < 4; num++ ){
            for(int posNum = 0; posNum < 13; posNum++) {
                deck.add(new Card(suit[num], name[posNum], num + 2));
            }
        }

        return deck;
    }

    public static ArrayList<Card> shuffleDeck(ArrayList<Card> deck){
        Random rand = new Random();
        ArrayList<Card> newDeck = new ArrayList<>(52);
        while(deck.size()>0){
            int index = rand.nextInt(deck.size());
            Card removedCard = deck.remove(index);
            newDeck.add(removedCard);
        }

        return newDeck;
    }

    public static Game dealHand(Game game, int numCards){
        ArrayList<Card> hand = new ArrayList<>(numCards);
        for(int index = 0; index < numCards; index++){
            game.player1Hand.add(game.deck.get(index));

        }

        return game;
    }
}
