import java.util.Scanner;

public class MajorityEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int idx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= n/2) {
                idx = i;
            }
        }
        if (idx >= 0) {
            System.out.print(arr[idx]);
        } else {
            System.out.println("NO MAJORITY ELEMENT");
        }
    }
}
