import java.util.Scanner;

public class Baekjoon8393 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n * (n + 1) / 2);
        sc.close();
    }
}
