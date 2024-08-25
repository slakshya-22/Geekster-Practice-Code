import java.util.Scanner;

public class CountNoInStrng {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        int count = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (check) {
                    count++;
                    check = true;
                }
            } else {
                check = false;
            }
        }
        System.out.println(count);
    }
}
