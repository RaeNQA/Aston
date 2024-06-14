public class task13 {
    public static void main() {
        int[][] table = arr(6);
        pArr(table);
    }

    public static int[][] arr(int s) {
        int[][] sArr = new int[s][s];
        for (int i = 0; i < s; i++) {
            sArr[i][i] = 1;
        }
        return sArr;
    }

    public static void pArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
