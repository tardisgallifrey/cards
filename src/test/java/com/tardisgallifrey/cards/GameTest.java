package com.tardisgallifrey.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void shuffleDeckHas52() {
        Game game = new Game();
        game.shuffleDeck();
        assertEquals(52, game.deck.size());
    }

    @Test
    void shuffleDeckIsAllUnique(){
        Game game = new Game();
        Set<Card> deck = new HashSet<>();
        game.shuffleDeck();
        for(Card card : game.deck){
            deck.add(card);
        }
        assertEquals(game.deck.size(), deck.size());

    }
}