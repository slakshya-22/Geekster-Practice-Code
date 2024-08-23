import java.util.Scanner;

public class GreatestTillMe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] temp = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (i > max) {
                max = i;
            }
            temp[i] = max;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
            scn.close();
        }
    }
}
