package com.tardisgallifrey.cards;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void shuffleReturnsUniqueDeck() {
        ArrayList<Card> deck = new ArrayList<>(52);
        ArrayList<Card> deck2 = new ArrayList<>(52);
        deck = Card.createDeck();
        deck2 = Card.shuffleDeck(deck);

        Set<Card> set = new HashSet<>();
        for(Card each: deck2) assertTrue(set.add(each));
        assertEquals(52, deck2.size());

    }
}