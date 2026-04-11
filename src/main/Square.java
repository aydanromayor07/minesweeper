/*
 * Author: Aydan Romayor
 * Class: Square.java
 * 4/9/2026
 * 
 * Description:
 * This class controls the aspect of a single square on the game grid.
 * A square either has a value from 0-8 or is a bomb.
 * A square can either be opened or closed.
 * A square can be flagged or not.
 * If a square is closed, it always prints "[ ]"
 * If a square is opened and is unflagged and is not a bomb, it shows its numerical value [n]
 * If a square is opened, unflagged, and is a bomb, it shows the bomb graphic [ó]
 * If a square is opened and is a flag, it shows the flag graphic [P]
 */

package main;

public class Square {
    // Fields
    private final static int EMPTY = 0;
    private final static int BOMB = 9;

    private int value;
    private boolean flagged;
    private boolean opened;

    // Text graphics
    private final static String OPEN_STRING = "X";
    private final static String CLOSED_STRING = "-";
    private final static String BOMB_STRING = "ó";
    private final static String FLAG_STRING = "P";

    // Constructor(s)
    public Square() {
        value = 0;
        flagged = false;
        opened = false;
    }

    // methods
    public void setValue(int value) { this.value = value; }

    public void open() { opened = true; }

    public void flag() { flagged = !flagged; }

    public int getValue() { return value; }

    public boolean isOpen() { return opened; }

    public boolean isFlagged() { return flagged; }

    public String formattedString(String toInsert) {
        return String.format("[%s]", toInsert);
    }

    @Override
    public String toString() {
        if (!opened) return formattedString(CLOSED_STRING);
        if (flagged) return formattedString(FLAG_STRING);

        switch(getValue()) {
            case EMPTY:
                return formattedString(OPEN_STRING);
            case BOMB:
                return formattedString(BOMB_STRING);
            default:
                return formattedString(String.valueOf(getValue()));
        }
    }
}