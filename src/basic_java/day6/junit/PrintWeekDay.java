package basic_java.day6.junit;

import java.util.Scanner;

public class PrintWeekDay {

	static void dayOfWeek(int m, int d, int y) {

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		
		switch(d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		dayOfWeek(month, day, year);
				
	}
}
