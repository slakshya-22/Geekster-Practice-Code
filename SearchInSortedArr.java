import java.util.Scanner;

public class SearchInSortedArr {

    static void findX(int m, int n, int arr[][], int x) {
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println(i + "\n" + j);
                return;
            } else if (arr[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not Found");
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
        int x = scn.nextInt();
        scn.close();
        findX(m, n, arr, x);
    }
}
