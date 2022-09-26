package basic_java.day6.junit;

import java.util.Scanner;

public class TemperatureConverter {

	static float temperatureConversion(char unit, float val) {
		float unitFahrCel = 0; 
		switch (unit) {
		case 'C':
			unitFahrCel = (val * 9 / 5) + 32;
			break;
		case 'F':
			unitFahrCel = (val - 32) * 5 / 9;
			break;
		default:
			System.out.println("Invalid Unit: Please enter either 'C' or 'F' only!");
		}
		
		return unitFahrCel;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'C' for celsius\tEnter 'F' for fahrenheit");
		System.out.print("Enter temperature unit: ");
		char unit = scanner.next().charAt(0);

		System.out.println("Enter temperature value: ");
		float value = scanner.nextFloat();

		float convertedVal = temperatureConversion(unit, value);
		
		switch(unit) {
		case 'C':
			System.out.println(value + "C = " + convertedVal + "F");
			break;
		case 'F':
			System.out.println(value + "F = " + convertedVal + "C");
		}
		
	}
}
