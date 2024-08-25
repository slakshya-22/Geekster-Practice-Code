import java.util.Scanner;

public class K_Frqnt_Ele {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] freq = new int[10];
        for (int i = 0; i < n; i++) {
            int input = scn.nextInt();
            int currFreq = freq[input];
            freq[input] = currFreq + 1;
        }
        int k = scn.nextInt();
        while (k > 0) {
            int max = 0;
            int index = -1;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] >= max) {
                    max = freq[i];
                    index = i;
                }
            }
            System.out.print(index + " ");
            freq[index] = 0;
            k--;
        }
        scn.close();
    }
}
