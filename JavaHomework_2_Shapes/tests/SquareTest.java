import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareTest {

    @org.testng.annotations.Test
    public void testSquareValidGettersAndSetters() {
        double intendedSide = 7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), intendedSide);
    }

    @org.testng.annotations.Test
    public void testSquareInvalidGettersAndSetters() {
        int intendedSide = -7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), 0.0);
    }

    @org.testng.annotations.Test
    public void testSquareArea() {
        double sideLength = 4;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.area(), sideLength * sideLength);
    }

    @org.testng.annotations.Test
    public void testSquarePerimeter() {
        double sideLength = 5;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.perimeter(), 4 * sideLength);
    }
}