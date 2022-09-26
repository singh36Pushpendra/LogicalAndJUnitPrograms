package basic_java.day6.logical;

import java.util.Scanner;

class ReverseNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of digits: ");
		int num = scan.nextInt();

		int digit, rev = 0;
		while (num != 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse number = " + rev);
	}
}
