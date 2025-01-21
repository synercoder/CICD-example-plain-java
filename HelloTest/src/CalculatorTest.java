import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    @Test
    public void testAdd() {
        var calc = new Calculator();

        Assert.assertEquals(2, calc.Add(1,1));
    }

    @Test
    public void testMultiply() {
        var calc = new Calculator();

        Assert.assertEquals(99, calc.Multiply(33, 3));
    }

    @Test
    public void testDivide() {
        var calc = new Calculator();

        Assert.assertEquals(3, calc.Divide(4, 2), 0.00000001);
    }

    @Test
    public void testDivideThrowsForZero() {
        var calc = new Calculator();

        var exception = Assert.assertThrows(java.lang.ArithmeticException.class, () -> {
            calc.Divide(1, 0);
        });

        Assert.assertNotNull(exception);
    }
}
