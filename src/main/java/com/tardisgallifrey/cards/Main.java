package com.tardisgallifrey.cards;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.shuffleDeck();

        game.dealHand(6);
        for(Card card : game.player1Hand){
            System.out.println(card.name()+card.suit());
        }

        System.out.println();
        for(Card card : game.player2Hand){
            System.out.println(card.name()+card.suit());
        }

        System.out.println();
        for(Card card : game.player3Hand){
            System.out.println(card.name()+card.suit());
        };

        System.out.println();
        for(Card card : game.player4Hand){
            System.out.println(card.name()+card.suit());
        }
    }
}