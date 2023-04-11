package com.SnackLadderGame;

public class DiceRoll {
    /**
     * dice
     */
    int dice;
    /**
     *  Constructor.  Rolls the dice, so that they initially
     *  show some random values.
     *  Call the roll() method to roll the dice.
     */

    public DiceRoll() {

        roll();
    }
    /**
     * Roll the dice by setting each of the dice to be
     * a random number between 1 and 6.
     */
    public void roll() {

        dice = (int)(Math.random()*6) + 1;

    }

}
