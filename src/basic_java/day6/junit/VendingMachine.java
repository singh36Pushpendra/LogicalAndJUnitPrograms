package basic_java.day6.junit;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		int[] notes = {1, 2, 5, 10, 50, 100, 500, 1000};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter change in Rs to be returned: ");
		int rupees = scanner.nextInt();
		int count = notes.length;
		int noteCount = 0;
		int totalNotes = 0;
		System.out.println("List of notes for change: " + rupees);
		while (rupees != 0) {
			count--;
			noteCount = rupees / notes[count];
			System.out.println(notes[count] + " X " + noteCount);
			totalNotes += noteCount;
			rupees = rupees % notes[count];
		}
		System.out.println("Minimum note needed to give the change = " + totalNotes);
	}
}
