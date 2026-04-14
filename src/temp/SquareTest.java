/*
 * Author: Aydan Romayor
 * Class: SquareTest.java
 * 4/11/2026
 * 
 * Description:
 * Class to test the Square class.
 * 
 * Expected output:
 * [-]
 * [X]
 * [5]
 * [ó]
 * [P]
 * [2]
 */

package temp;
import main.Square;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testSquares() {
        Square square1 = new Square();

        Assert.assertEquals("[-]", square1.toString());

        square1.open();
        Assert.assertEquals("[X]", square1.toString());

        square1.setValue(5);
        Assert.assertEquals("[5]", square1.toString());

        int BOMB = 9;
        square1.setValue(BOMB);
        Assert.assertEquals("[ó]", square1.toString());

        square1.flag();
        Assert.assertEquals("[P]", square1.toString());

        square1.flag();
        square1.setValue(2);
        Assert.assertEquals("[2]", square1.toString());
    }

    public static void printSquare(Square square) {
        System.out.println(square);
    }
}