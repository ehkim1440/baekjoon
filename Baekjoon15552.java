import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon15552 {
    public static void main(String[] args) throws IOException {
        int n = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            n = Integer.parseInt(in.readLine());
            for (int i = 1; i <= n; i++) {
                int a, b;
                String str = in.readLine();
                String [] tokens = str.split(" ");
                a = Integer.parseInt(tokens[0]);
                b = Integer.parseInt(tokens[1]);
                out.write(String.format("%d", a + b));
                out.newLine();
            }
            out.flush();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            in.close();
            out.close();
        }
    }
}
