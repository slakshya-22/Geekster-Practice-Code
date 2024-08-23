import java.util.Scanner;

public class ColumnWise {
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
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j]);
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
