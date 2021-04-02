import java.util.Scanner;

public class Baekjoon3052 {
    public static void main(String[] args) {
        int n = 10;
        int result = 0;
        int [] count = new int[42];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            int ni = sc.nextInt();
            if (count[ni % 42] == 0) {
                result++;
                count[ni % 42]++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
