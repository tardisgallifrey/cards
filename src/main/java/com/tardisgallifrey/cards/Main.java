package com.tardisgallifrey.cards;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Card card;
        ArrayList<Card> deck = new ArrayList<>(52);

        String[] suit = {"H", "D", "S", "C"};
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
        for(int num = 0; num < 4; num++ ){
            for(int posNum = 0; posNum < 12; posNum++) {
                deck.add(new Card(suit[num], name[posNum], num + 2));
            }
        }

        for(Card token : deck){
            System.out.println(token.getName()+token.getSuit());
        }

    }
}