package basic_java.day6.logical;

import java.util.Scanner;

class PrimeNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = scanner.nextInt();

		boolean flag = false;
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0) {
				flag = true;
				break;
			}

		if (flag || number < 2)
			System.out.println(number + " is not prime number!");
		else
			System.out.println(number + " is prime number!");
	}
}
