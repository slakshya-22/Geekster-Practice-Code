import java.util.Scanner;

public class NoRepeatingChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int[] freq = new int[26];
        scn.close();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
                return;                      // exit after finding the first non - repeating char
            }
        }
        System.out.println(-1);
    }
}
