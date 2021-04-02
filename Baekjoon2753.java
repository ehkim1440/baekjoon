import java.util.Scanner;

public class Baekjoon2753 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(((a % 4 == 0 && (a % 400 == 0 || a % 100 != 0)))? 1 : 0);
        sc.close();
    }
}
