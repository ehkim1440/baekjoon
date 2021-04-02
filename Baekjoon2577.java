import java.util.Scanner;

public class Baekjoon2577 {
    public static void main(String[] args) {
        int n = 3;
        int abc = 1;
        int [] count = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            int ni = sc.nextInt();
            abc *= ni;
        }
        for (int i = 0; abc > 0 && i < 10; i++) {
            count[abc % 10]++;
            abc /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
        sc.close();
    }
}
