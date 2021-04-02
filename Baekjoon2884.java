import java.time.LocalTime;
import java.util.Scanner;

public class Baekjoon2884 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        LocalTime time = LocalTime.of(a, b, 0);
        LocalTime timeBefore40 = time.minusMinutes(45);
        System.out.println(timeBefore40.getHour() + " " + timeBefore40.getMinute());
        sc.close();
    }
}
