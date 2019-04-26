package pl.widawski.barcodeChecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BCAnalyzer {

	public String analyze(int bcType, String barCode) {
		
	
		
		if(bcType == 1) {
			Pattern ean8Pattern = Pattern.compile("\\d{7,10}");
			Matcher ean8Matcher = ean8Pattern.matcher(barCode);
			boolean ean8Check = ean8Matcher.matches();
			if(ean8Check == true) {
				if(barCode.length() == 7) {
					barCode = "0" + barCode;
				}
				else if(barCode.length() == 10) {
					barCode = barCode.substring(0,8);
				}
			}
			else {
				System.out.println("Wrong barcode of EAN-8 type.");
				barCode = "";
			}
		}
		else if(bcType == 2) {
			boolean ean13Check;
			Pattern ean13Pattern = Pattern.compile("\\d{12,15}");
			Matcher ean13Matcher = ean13Pattern.matcher(barCode);
			ean13Check = ean13Matcher.matches();
			if(ean13Check == true) {
				if(barCode.length() == 12) {
					barCode = "0" +barCode;
				}
				else if(barCode.length() == 15) {
					barCode = barCode.substring(0,13);
				}
			}
			else {
				System.out.println("Wrong barcode of EAN-13 type.");
				barCode = "";
			}
		}
		else {
			System.out.println("Try again.");
			barCode = "";
		}
		
		
		return barCode;
	}
	
}
