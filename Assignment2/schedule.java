import java.util.Scanner;

public class schedule {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalCase = scan.nextInt();
		for (int c = 0; c < totalCase; c++) {

			int totalDay = scan.nextInt();
			int dayUnit = scan.nextInt();
			int sleepUnit = scan.nextInt();
			int[] gameTime = new int[totalDay];
			int totalGameTime = 0;

			for (int i = 0; i < totalDay; i++) {
				int paper = scan.nextInt();
				int assign = scan.nextInt();
				int proj = scan.nextInt();

				gameTime[i] = dayUnit - sleepUnit - paper * 2 - assign * 3 - proj * 5;
				totalGameTime += gameTime[i];
				System.out.print(gameTime[i] + " ");
			}

			double avgGameTime = totalGameTime / (double) totalDay;
			int dayAbove = 0;
			for (int i = 0; i < totalDay; i++) {
				if (gameTime[i] > avgGameTime) {
					dayAbove++;
				}
			}
			System.out.println("\n" + dayAbove);
		}
	}
}
