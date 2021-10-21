import java.util.Scanner;

public class match_game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt(); //行
		int col = scan.nextInt(); //列

		//小于3 * 3，必为No
		if (col < 3 && row < 3) {
			System.out.println("No");
			return;
		}

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = scan.nextInt();

			}
		}

		//行检测
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col - 2; j++) {
				if (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i][j + 2]) {
					System.out.println("Yes");
					return; //结束程序
				}
			}
		}

		//列检测
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i + 2][j]) {
					System.out.println("Yes");
					return; //结束程序
				}
			}
		}
		System.out.println("No");
	}
}
