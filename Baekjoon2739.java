import java.util.Scanner;

public class Baekjoon2739 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
        sc.close();
    }
}
