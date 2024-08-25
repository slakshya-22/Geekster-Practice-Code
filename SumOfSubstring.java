import java.util.Scanner;

public class SumOfSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                sum += Integer.parseInt(str);
            }
        }
        scn.close();
        System.out.println(sum);
    }
}
