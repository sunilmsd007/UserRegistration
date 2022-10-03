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

	public boolean validateLastName(String lastname) {
		// last name starts with capital letter and have minimum 3 characters
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}

	public boolean validateEmail(String email) {
		//method to validate email
		Pattern pattern = Pattern.compile("(abc)[.]?[a-z]*@(bl.co)[.]?[a-z]{0,2}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.validateFirstName("Sunil")); // valid input
		System.out.println(user.validateFirstName("sunil")); // invalid input
		System.out.println(user.validateLastName("Kumar")); // valid input
		System.out.println(user.validateLastName("kumar")); // invalid input
		System.out.println(user.validateEmail("abc.xyz@bl.co.in")); // valid input
		System.out.println(user.validateEmail("abcd.xyz@bl.com.in")); // invalid input
	}
}
