import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100 - b % 10) / 10);
        System.out.println(a * (b / 100));
        System.out.println(a * b);
        sc.close();
    }
}
