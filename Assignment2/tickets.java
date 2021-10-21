import java.util.Arrays;
import java.util.Scanner;

/**
 * 每个站都会对应一个剩余座位数，a -> b-1 座位最少的那个就是正确答案
 **/

public class tickets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalStation = scan.nextInt(); //总站数n
		int totalSeat = scan.nextInt(); //座位总数m
		int[] remainSeat = new int[totalStation]; //存储剩余座位的数组
		Arrays.fill(remainSeat, totalSeat); //用座位总数填充数组

		int soldTicket = scan.nextInt(); //已卖出票的总数

		for (int i = 0; i < soldTicket; i++) {
			//已卖出票的起始站和终点站
			int start = scan.nextInt();
			int end = scan.nextInt();

			//根据卖出的票调整剩余座位
			for (int j = start; j < end; j++) {
				remainSeat[j]--;
			}
		}

		// Gary and his class
		int start = scan.nextInt();
		int end = scan.nextInt();

		//找到a -> b-1 座位数的最小值，即为t
		int min = remainSeat[start];
		for (int i = start; i < end; i++) {
			min = Math.min(min, remainSeat[i]);
		}
		System.out.println(min);
	}
}
