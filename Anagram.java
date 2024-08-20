import java.util.Scanner;

public class Anagram {

    static boolean analogCheck(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char chh = t.charAt(i);
            freq[chh - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
               return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        scn.close();
        boolean result = analogCheck(s, t);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
