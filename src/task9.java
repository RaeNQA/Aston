public class task9 {
    public static void main() {
        System.out.println(hYear(2024));
    }
    public static boolean hYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}