package com.tardisgallifrey.cards;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.shuffleDeck();

        game.dealHand(6);

        game.printHand(game.player1Hand);
        System.out.println();
        game.printHand(game.player2Hand);
        System.out.println();
        game.printHand(game.player3Hand);
        System.out.println();
        game.printHand(game.player4Hand);

    }
}