package com.tardisgallifrey.cards;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void shuffleReturnsUniqueDeck() {
        ArrayList<Card> deck = Card.createDeck();
        ArrayList<Card> deck2 = Card.shuffleDeck(deck);

        Set<Card> set = new HashSet<>();
        for(Card each: deck2) assertTrue(set.add(each));

    }
}