package basic_java.day6.junit;

import java.util.Scanner;

public class DecimalToBinary {

	static int toBinary(int decimal) {
		int powOf2 = 0, count = 0;
		String binStr = "";
		while (powOf2 <= decimal) {
			powOf2 = (int)Math.pow(2, count);
			++count;
		}
		for (int i = count - 2; i >= 0; i--) {
			powOf2 = (int)Math.pow(2, i);
			if (powOf2 <= decimal) {
				decimal = decimal - powOf2;
				binStr += 1;
			}
			else
				binStr += 0;
			
		}
		return Integer.parseInt(binStr);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		
		int binary = toBinary(num);
		System.out.println("Binary value of " + num + " = " + binary);
	}
}
