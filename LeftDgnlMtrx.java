import java.util.Scanner;

public class LeftDgnlMtrx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        // print diagonals from first row
        for (int col = 0; col < n; col++) {
            int i = 0;
            int j = col;
            while (i < n && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
        }

        // print diagonals from first col (except top left)
        for (int row = 1; row < n; row++) {
            int i = row;
            int j = n - 1;
            while (i < n && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
        }
    }
}
