import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int trgt = scn.nextInt();
        scn.close();
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == trgt) {
                //duplicates
                while (arr[i] == arr[i + 1]) {
                    i++;
                } while (arr[j] == arr[j - 1]) {
                    j--;
                }
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if(sum > trgt) {
                j--;
            } else {
                i++;
            }
        }
    }
}
