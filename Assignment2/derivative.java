import java.util.Scanner;
import java.lang.*;

public class derivative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int[] a = new int[total];

		for (int i = 0; i < total; i++) {
			a[i] = scan.nextInt();
		}

		double x = scan.nextDouble(); //X
		double res = 0;

		for (int i = 1; i < total; i++) {
			double f = f(a[i], x, i);
			res += f;
		}

		System.out.printf("%.2f", res);
	}

	static double f(int a, double x, int i) {
		return a * Math.pow(x, i - 1) * i;
	}
}