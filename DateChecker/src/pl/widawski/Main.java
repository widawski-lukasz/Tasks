package pl.widawski;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int day = 0, month = 0, year = 0;
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Give the day: ");
		try {
			day = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Improper day.");
			System.exit(0);
		}
		System.out.println("Give the month: ");
		try {
			month = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Improper month.");
			System.exit(0);
		}
		System.out.println("Give the year: ");
		try {
			year = scanner.nextInt();
		} catch  (Exception e) {
			System.out.println("Improper year.");
			System.exit(0);
		}

		System.out.println(DateValidator.validator(day, month,year));
		scanner.close();

	}
	
	

}
