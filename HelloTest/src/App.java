public class App {
    public static void main(String[] args) throws Exception {
        var calculator = new Calculator();
        System.out.println("Hello, World!");
        System.out.println("1 + 1 = " + calculator.Add(1, 1));
        System.out.println("2 * 3 = " + calculator.Multiply(2, 3));
        System.out.println("5 * 4 = " + calculator.Devide(5, 4));
    }
}
