public class task5 {
    public static void main() {

        System.out.println(aSum(5, 6));
    }

    public static boolean aSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}