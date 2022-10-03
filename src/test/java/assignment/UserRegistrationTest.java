package assignment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

	String emailID;
	boolean expectedResult;
	UserRegistration user;

	public UserRegistrationTest(String emailID, boolean expectedResult) {
		this.emailID = emailID;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object[][] { { "abc.xyz@bl.co.in", true }, { "abc+100@gmail.com", true },
				{ "abcd@.com", false }, { ".abc@yahoo.com.in", false } });
	}

	@Test
	public void validateMultipleEmails() {
		assertEquals(expectedResult, user.validateEmail(emailID));
	}

	@Test
	public void returnValidFirstName() {
		boolean result = user.validateFirstName("Sunil");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidFirstName() {
		boolean result = user.validateFirstName("sunil");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidlastName() {
		boolean result = user.validateFirstName("Kumar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidlastName() {
		boolean result = user.validateFirstName("kumar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidEmail() {
		boolean result = user.validateEmail("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidPhoneNumber() {
		boolean result = user.validatePhoneNumber("919164144279");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidPassword() {
		boolean result = user.validatePassWord("A1@aS7ft");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidPassword() {
		boolean result = user.validatePassWord("aw1@sdf");
		Assert.assertEquals(false, result);
	}
}
