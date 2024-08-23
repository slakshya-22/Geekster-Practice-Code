import java.util.Scanner;

public class ConsonentIndices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        boolean check = false;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vowels.length; i++) {
            char c = s.charAt(i);
            for (char ch : vowels) {
                if (c == ch) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(i);
            }
        }
        scn.close();
    }
}
