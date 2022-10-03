package assignment;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user = new UserRegistration();

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
}
