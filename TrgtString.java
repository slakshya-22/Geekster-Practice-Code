import java.util.Scanner;

public class TrgtString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String trgt = scn.nextLine();
        scn.close();
        if (s.length() != trgt.length()) {
            System.out.println("False");
            return;
        }
        String concat = s + trgt;
        if (concat.contains(trgt)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
