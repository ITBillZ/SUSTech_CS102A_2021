import java.util.Scanner;

public class pairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalCases = scan.nextInt();
		int[][] arr = new int[totalCases][];

		for (int i = 0; i < totalCases; i++) {
			int size = scan.nextInt();
			arr[i] = new int[size]; //创建数组内的不等长数组

			for (int j = 0; j < size; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < totalCases; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] + arr[i][k] == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
