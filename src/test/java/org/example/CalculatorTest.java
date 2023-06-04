import org.junit.Assert;
import org.junit.Test;

import org.example.Calculator;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.addition(3, 4);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(8, 5);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(6, 7);
        Assert.assertEquals(42, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.division(10, 2);
        Assert.assertEquals(5, result);
    }
}
