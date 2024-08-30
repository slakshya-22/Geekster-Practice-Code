import java.util.Scanner;

public class SearchCharacter {

    static int binarySearch(char[] arr, char x) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (arr[m] == x) {
                return m;
            } else if (arr[m] > x) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);
        int n = scn.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next().charAt(0);  
        }
        scn.close();

        //b -> 'c'
        x++;
        for (char ch = x; ch <= 'z'; ch++) {
            int ans = binarySearch(arr, ch);  // Search for the next character in the array
            if (ans != -1) {
                System.out.println(arr[ans]);
                return;
            }
        }
        System.out.println(-1);
    }
}
