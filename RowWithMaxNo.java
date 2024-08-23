import java.util.Scanner;

public class RowWithMaxNo {

    static void findRows(int[][] arr, int m, int n) {
        int max = 0;
        int rowMax = 0;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                rowMax = i;
            }
        }
        if (max == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[rowMax][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        findRows(arr, m, n);
    }
}
