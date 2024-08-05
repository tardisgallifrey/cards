package com.tardisgallifrey.cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void shuffleDeckHas52() {
        Game game = new Game();
        game.shuffleDeck();
        assertEquals(52, game.deck.size());
    }

    void shuffleDeckIsAllUnique(){
        Game game = new Game();
        game.shuffleDeck();

    }
}