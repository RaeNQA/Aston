package factorial;

public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 24;


        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long result = factorial(number);
            System.out.println("Факториал числа " + number + " равен " + result);
        }
    }
}