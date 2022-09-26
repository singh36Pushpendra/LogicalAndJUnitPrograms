package basic_java.day6.logical;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		int divisorsSum = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				divisorsSum += i;
		
		if (num == divisorsSum)
			System.out.println(num + " is a perfect number!");
		else
			System.out.println(num + " is not perfect number!");
	}
}
