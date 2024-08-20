import java.util.Scanner;

public class SnglToMlti {

    static int[][] convertArr(int n, int arr[], int p, int q) {
        if (p * q != n) {
            return new int[0][0];
        }
        int[][] result = new int[p][q];
        int idx = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                result[i][j] = arr[idx++];                
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int p = scn.nextInt();
        int q = scn.nextInt();
        scn.close();
        int[][] result = convertArr(n, arr, p, q);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
