package pl.widawski.barcodeChecker;

public class Main {

	public static void main(String[] args) {
		BCInput test = new BCInput();
		BCAnalyzer testAnalyze = new BCAnalyzer();
		System.out.println(testAnalyze.analyze(test.getBCType(), test.getBC()));
	}

}
