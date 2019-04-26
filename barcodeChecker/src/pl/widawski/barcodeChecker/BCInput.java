package pl.widawski.barcodeChecker;

import java.util.Scanner;

public class BCInput implements BCInterface {
	String barCode;
	int bcType;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public int getBCType() {
		System.out.println("Choose the type of barcode. '1' for EAN-8 / '2' for EAN-13.");
		try {
			bcType = scanner.nextInt();
			scanner.nextLine();
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return bcType;
	}
	public String getBC() {
		if (bcType == 1 || bcType == 2) {
			System.out.println("Enter the barcode.");
			try {
				barCode = scanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		} else {
			System.out.println("Wrong type! Choose 1 or 2 type of your barcode.");
			barCode = "";
		}
		scanner.close();
		return barCode;
	}
	
}
