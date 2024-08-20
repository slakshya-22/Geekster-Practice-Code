import java.util.Scanner;

public class RowWise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
