package basic_java.day6.logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 .....
		int a = 0, b = 1, c = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter nth number you wan't to find in fibonacci series: ");
		int nth = scanner.nextInt();
		
		if (nth == 1)
			System.out.println(nth + "st term in fibonacci series = " + a);
		else if (nth == 2)
			System.out.println(nth + "nd term in fibonacci series = " + b);
		else if (nth > 2) {
			for (int i = 3; i <= nth; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(nth + "th term in fibonacci series = " + c);
		}
		else
			System.out.println("Invalid: Please enter natural number only!");
	}
}
