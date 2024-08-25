import java.util.Scanner;

public class PawriMeme {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        String result = s.replace("party", "pawri");
        System.out.println(result);
    }
}
