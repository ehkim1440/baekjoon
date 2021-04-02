import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args) {
        int max = 0, max_i = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            int ni = sc.nextInt();
            if (ni > max) {
                max = ni;
                max_i = i;
            }
        }
        System.out.println(max);
        System.out.println(max_i + 1);
        sc.close();
    }
}
