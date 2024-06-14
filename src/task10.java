public class task10 {
    public static void main() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }; // Ё
        for (int num = 0; num < arr.length; num++) {
            arr[num] = (arr[num] == 0) ? 1 : 0;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}