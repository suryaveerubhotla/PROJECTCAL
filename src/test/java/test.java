import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(-2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, Calculator.subtract(5, 2));
        assertEquals(-4, Calculator.subtract(2, 6));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(-8, Calculator.multiply(4, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-4, Calculator.divide(8, -2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(6, 0);
    }
}
