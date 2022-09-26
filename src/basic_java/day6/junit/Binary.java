 package basic_java.day6.junit;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		String nibble1 = "", nibble2 = "";
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		String binaryString = Integer.toBinaryString(num);

		System.out.println("Binary form of decimal " + num + " = " + binaryString);
		char[] binaryVals = new char[8];
		count = binaryString.length() - 1;
		for (int i = 7; i >= 0; i--) {
			if (count != -1) {
				binaryVals[i] = binaryString.charAt(count);
				count--;
			}
			else
				binaryVals[i] = '0';
			
		}
		
		for (int i = 0; i < 8; i++)
			if (i < 4)
				nibble1 += binaryVals[i];
			else
				nibble2 += binaryVals[i];
				
		String swappedBinary = nibble2 + nibble1;

		System.out.println("Number after swapping nibbles: " + swappedBinary);
		char[] swappedBinaries = swappedBinary.toCharArray();
		
		int binToDec = 0;
		for (int i = 7, j = 0; i >= 0; i--, j++)
			if (swappedBinaries[i] == '1')
				binToDec += Math.pow(2, j);
		System.out.println("\nDecimal form of binary " + swappedBinary + " = " + binToDec);
		
	}
}