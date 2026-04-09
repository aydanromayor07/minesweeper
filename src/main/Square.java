package main;
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

public class Square {
    // Fields
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

    public String toString() {
        if (!opened) return String.format("[%s]", CLOSED_STRING);
        else return "";
    }
}
