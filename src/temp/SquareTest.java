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

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();

        printSquare(square1); // Expected: [-]
        
        square1.open();
        printSquare(square1); // Expected: [X]

        square1.setValue(5);
        printSquare(square1); // Expected: [5]

        int BOMB = 9;
        square1.setValue(BOMB);
        printSquare(square1); // Expected: [ó]

        square1.flag();
        printSquare(square1); // Expected: [P]

        square1.flag();
        square1.setValue(2);
        printSquare(square1); // Expected: [2]
    }

    public static void printSquare(Square square) {
        System.out.println(square);
    }
}