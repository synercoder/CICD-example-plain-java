import java.lang.ArithmeticException;

public class Calculator {
    public int Add(int a, int b) {
        return a + b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public double Divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }

        return a / b;
    }
}
