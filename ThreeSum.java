import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int trgt = 0;
        Arrays.sort(arr);

        // fixing with help of k
        for (int k = 0; k < arr.length; k++) {
            if (k != 0 && arr[k] == arr[k - 1]) {
                continue;
            }
            int nTar = trgt - arr[k];
            int i = k + 1;
            int j = n - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum == nTar) {
                    System.out.println(arr[k] + " " + arr[i] + " " + arr[j]);
                    i++;
                    j--;
                } else if (sum > nTar) {
                    j--;
                } else if (sum < nTar) {
                    i++;
                }
            }
        }
    }
}
