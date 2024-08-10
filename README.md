# A Java console playing cards app

This is the beginnings of a console app to play regular cards, as in a 52 card deck.

All the work revolves around two objects, `Game` and `Card`.  `Card` is just a record for card name (Ace, King, etc.), a suit (like hearts), and a rank (integer, ace high).

Instantiating the `Game` object creates a new deck in its constructor.

The `shuffle()` method shuffles the deck from its out of the box state.  

TODO: add an integer parameter for number of shuffles performed.

TODO: add a parameter for deck cut.

The `Game` object also creates four player hand lists of cards.  

TODO: create a separate player hand object and instantiate as many as you wish.

The method `dealHand(int num)` deals out a player's hand according to how many cards.

There are also two rudimentary display methods.

Some deck JUnit tests have been configured.

As always, use at your own risk.