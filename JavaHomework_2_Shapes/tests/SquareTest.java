/**
 * NOTE: This Test class is already complete and should be used as reference for the other test cases
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareTest {

    /**
     * This test is for the 'Getters' and 'Setters'
     */
    @org.testng.annotations.Test
    public void testSquareValidGettersAndSetters() {
        double intendedSide = 7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), intendedSide);
    }

    /**
     * This test is a negative test for the 'Getters' and 'Setters'
     */
    @org.testng.annotations.Test
    public void testSquareInvalidGettersAndSetters() {
        int intendedSide = -7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), 0.0);
    }

    /**
     * This test is for the area
     */
    @org.testng.annotations.Test
    public void testSquareArea() {
        double sideLength = 4;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.area(), sideLength * sideLength);
    }

    /**
     * This test is for the perimeter
     */
    @org.testng.annotations.Test
    public void testSquarePerimeter() {
        double sideLength = 5;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.perimeter(), 4 * sideLength);
    }
}