import java.util.Scanner;

public class Baekjoon11021 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 0, b = 0;       
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));
        }
        sc.close();
    }
}
