import java.util.Scanner;

/**
 * MaxFreqChar
 */
public class MaxFreqChar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;   // Increment the frequency of the corresponding character
        }

        //find char with max frequency
        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) (i + 'a');
            }
        }
        System.out.println(maxChar);
    }
}