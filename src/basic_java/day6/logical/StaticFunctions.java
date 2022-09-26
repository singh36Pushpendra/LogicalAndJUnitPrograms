package basic_java.day6.logical;

import java.util.Random;
import java.util.Scanner;

public class StaticFunctions {

	public static void main(String[] args) {
		int randomNum;
		byte count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size for coupons array: ");
		int size = scanner.nextInt();
		
		int[] distinctCoupons = new int[size];
		System.out.println("Enter " + size + " distinct whole numbers:");
		for (int i = 0; i < size; i++)
			distinctCoupons[i] = scanner.nextInt();
		
		java.util.Arrays.sort(distinctCoupons);
		
		for (int i : distinctCoupons)
			System.out.print(i + " ");
		
		Random random = new Random();
		randomNum = random.nextInt(distinctCoupons[size - 1] + 1);
		for (int i = 0; i < size; i++) {
			count++;
			while (randomNum != distinctCoupons[i]) {
				randomNum = random.nextInt(distinctCoupons[size - 1] + 1);
				count++;
				System.out.print(randomNum + " ");
			}
		}
		System.out.println("\n\nTotal random number generated = " + count);
		
		
	}
}
