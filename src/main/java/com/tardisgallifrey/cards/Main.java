package com.tardisgallifrey.cards;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.deck = Card.createDeck();


        Game game2 = new Game();
        game2.deck = Card.shuffleDeck(game.deck);
        for(Card token : game2.deck){
            System.out.println(token.getName()+token.getSuit());
        }
    }
}