import java.util.Scanner;

public class MiddleIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        int left = 0;
        for (int i = 0; i < n; i++) {
            int right = total - left - arr[i];
            if (left == right) {
                System.out.println(i);
            }
            left += arr[i];
        }
        System.out.println(-1);
    }
}
