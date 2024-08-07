import java.util.Scanner;

public class MaxProdSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        // logic
        int max = 0;
        int currMax = 1;
        int currMin = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                currMax = currMax * arr[i];
                currMin = currMin * arr[i];                               // -> It will find currentMin
                if (currMin > 0) {
                    currMin = 1;
                }
            } else if (arr[i] < 0) {
                int temp = currMax;
                currMax = arr[i] * currMin;
                currMin = arr[i] * temp;
                if (currMax < 0) {
                    currMax = 1;
                }
            } else {
                currMax = 1;
                currMin = 1;
            }
            max = Math.max(currMax, Math.max(max, arr[i]));
        }
        System.out.println(max);
    }
}
