package com.tardisgallifrey.cards;


public class Main {
    public static void main(String[] args) {

        //Instantiate a card game object
        Game game = new Game();

        //shuffle three times
        for(int i = 0; i < 3; i++) {
            game.shuffleDeck();
        }

        //deal all four players six cards
        game.dealHand(6);

        //print player 1's hand
        game.printHand(game.player1Hand, 1);
        System.out.println();

        //flip top card of deck
        Card card = game.flip();
        System.out.println("Card on top flipped: "+card.toString());

        //flip top card of deck and add to player 1 hand
        game.player1Hand.add(game.flip());

        System.out.println();

        game.printHand(game.player1Hand, 1);

    }
}