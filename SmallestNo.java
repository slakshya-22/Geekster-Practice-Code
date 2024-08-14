import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SmallestNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr[i] = "" + val;
        }
        scn.close();
        Comparator <String> myComp = new Comparator<String>() {
            public int compare (String a, String b) {
                String x = a + b;
                String y = b + a;
                return x.compareTo(y);
            } 
        };
        Arrays.sort(arr, myComp);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
