import java.util.Scanner;

public class Baekjoon10871 {
    public static void main(String[] args) {
        int n = 0, x = 0;
        boolean isFirst = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < x) {
                if (false == isFirst) {
                    System.out.print(" ");
                } else {
                    isFirst = false;
                }
                System.out.print(a);
            }
        }
        sc.close();
    }
}