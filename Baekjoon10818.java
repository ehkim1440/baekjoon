import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon10818 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        System.out.println(Collections.min(array) + " " + Collections.max(array));
        sc.close();
    }
}
