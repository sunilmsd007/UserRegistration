package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstname) {
		// first name starts with capital letter and have minimum 3 characters
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(firstname);
		return matcher.matches();
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.validateFirstName("Sunil")); //valid input
		System.out.println(user.validateFirstName("sunil")); //invalid input
	}
}
