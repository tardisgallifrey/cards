package com.tardisgallifrey.cards;

public record Card(String suit, String name, int rank) {

    @Override
    public String toString() {
        return name+suit;
    }

}
