package org.example.carddeck;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstractDeck implements Deck{

    protected List<Card> cards;

//    Setting up the getter
    public List<Card> getCards() {
        return this.cards;
    }


//    Not have to put shuffle, if we dont want to use shuffle, we just override it
    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }
}
