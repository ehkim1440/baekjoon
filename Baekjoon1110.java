import java.util.Scanner;

public class Baekjoon1110 {
    public static void main(String[] args) {
        int a = 0, a1 = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        a1 = a;
        do {
            a1 = (a1 % 10) * 10 + (((a1 / 10) + (a1 % 10)) % 10);
            n++;
        } while (a != a1);
        System.out.println(n);
        sc.close();
    }
}
