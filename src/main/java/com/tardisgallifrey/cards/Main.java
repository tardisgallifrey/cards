package com.tardisgallifrey.cards;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.shuffleDeck();

        game.dealHand(10);

        game.printHand(game.player1Hand, 1);
        System.out.println();
        game.printHand(game.player2Hand, 2);
        System.out.println();
        game.printHand(game.player3Hand, 3);
        System.out.println();
        game.printHand(game.player4Hand, 4);

    }
}