import java.util.Scanner;

public class Baekjoon2742 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
