public class task14 {
    public static void main() {
        int len = 3;
        int initialValue = 7;

        int[] aArr = cArr(len, initialValue);

        for (int num : aArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] cArr(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
