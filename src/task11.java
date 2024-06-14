public class task11 {
    public static void main() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        mas(arr);
    }

    public static void mas(int[] arr) {
        int cell = 55;
        System.out.print(arr[cell - 1]);
        System.out.println();
    }
}
