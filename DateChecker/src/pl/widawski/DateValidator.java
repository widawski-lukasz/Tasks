package pl.widawski;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {

	public static boolean validator(int intDay, int intMonth, int intYear) {
		boolean isCorrect = false;
		String stringDate;
		
		if (intYear < 2001 || intYear > 2099) {
			isCorrect = false;
		}
		else {
		stringDate = intYear + "-" + intMonth + "-" + intDay;
		Pattern datePattern = Pattern.compile("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))");
		Matcher dateMatcher = datePattern.matcher(stringDate);
		isCorrect = dateMatcher.matches();
		}
		return isCorrect;
	}
}
