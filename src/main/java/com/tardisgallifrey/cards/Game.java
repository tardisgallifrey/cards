package com.tardisgallifrey.cards;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public ArrayList<Card> deck = new ArrayList<>();
    public ArrayList<Card> player1Hand = new ArrayList<>();
    public ArrayList<Card> player2Hand = new ArrayList<>();
    public ArrayList<Card> player3Hand = new ArrayList<>();
    public ArrayList<Card> player4Hand = new ArrayList<>();

    //Instantiation calls constructor
    //which creates new deck/all cards in order
    public Game() {
        String[] suit = {"H", "D", "S", "C"};
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int num = 0; num < 4; num++) {
            for (int posNum = 0; posNum < 13; posNum++) {
                deck.add(new Card(suit[num], name[posNum], num + 2));
            }
        }

    }


    //shuffle the deck
    public void shuffleDeck(){
        Random rand = new Random();
        ArrayList<Card> newDeck = new ArrayList<>(52);
        while(deck.size()>0){
            int index = rand.nextInt(deck.size());
            Card removedCard = deck.remove(index);
            newDeck.add(removedCard);
        }
        this.deck = newDeck;
    }

    //deal a hand to each player of "size"
    public void dealHand(int size){
        int index = 0;
        for(int i = 0; i<size; i++){
            player1Hand.add(deck.remove(index));
            player2Hand.add(deck.remove(index + 1));
            player3Hand.add(deck.remove(index + 2));
            player4Hand.add(deck.remove(index + 3));
        }
    }
}
