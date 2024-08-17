import java.util.Scanner;

public class MaxFreqInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = scn.nextInt();
            freq[digit]++;
        }
        scn.close();

        int max = 0;
        int maxInt = 0;
        
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxInt = i;
            }
        }
        System.out.println(maxInt);
    }
}
