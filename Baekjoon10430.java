import java.util.Scanner;

public class Baekjoon10430 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
        sc.close();
    }
}
