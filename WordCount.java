import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (!check) {
                    count++;
                    check = true;
                }
            } else {
                check = false;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
