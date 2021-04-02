import java.util.Scanner;

public class Baekjoon17404 {
	public static final int CASE = 3;
    public static final int MAX_VALUE = Integer.MAX_VALUE / 1000;
	private int [][] rgb = null;
    private int [][] cost = null;
	private int n = 0;

	public Baekjoon17404(int n) {
		this.n = n;
		rgb = new int[n][CASE];
        cost = new int[n][CASE];
	}

	public void init(Scanner sc) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < CASE; j++) {
				rgb[i][j] = sc.nextInt();
			}
		}
	}

	public int calculate() {
        int result = MAX_VALUE;
        for (int i = 0; i < CASE; i++) {
            for (int j = 0; j < CASE; j++) {
                if (i == j) {
                    cost[0][j] = rgb[0][j];
                } else {
                    cost[0][j] = MAX_VALUE;
                }
            }

            for (int j = 1; j < n; j++) {
                cost[j][0] = rgb[j][0] + Math.min(cost[j-1][1], cost[j-1][2]);
                cost[j][1] = rgb[j][1] + Math.min(cost[j-1][0], cost[j-1][2]);
                cost[j][2] = rgb[j][2] + Math.min(cost[j-1][0], cost[j-1][1]);
            }

            for (int j = 0; j < CASE; j++) {
                if (i == j) {
                    continue;
                } else if (result > cost[n-1][j]) {
                    result = cost[n-1][j];
                }
            }
        }
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Baekjoon17404 b = new Baekjoon17404(n);
		b.init(sc);
		sc.close();
        int result = b.calculate();
        System.out.println(result);
	}

}