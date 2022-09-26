package basic_java.day6.junit;

import java.util.Scanner;

public class SquareRoot {
	static double sqrt(int c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = 1 / 2.0 * (c / t + t);
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any non-negative number: ");
		int num = scanner.nextInt();

		double sqrtOfNum = sqrt(num);
		System.out.println("Square root of " + num + " = " + sqrtOfNum);
	}
}
