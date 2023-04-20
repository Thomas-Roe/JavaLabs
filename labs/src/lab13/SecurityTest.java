package lab13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityTest {

	@Test 
	public void testLogonEmptyUserId() {
		String userId = ""; String password = "Freddy99"; Security s = new Security();
		boolean actual = s.logon(userId, password); boolean expected = false;
		assertEquals(expected, actual); 
		// assertFalse(actual);   // can also use this assert }
	}
	@Test 
	public void testLogonEmptyPassword() {
		String userId = "Simon"; String password = ""; Security s = new Security();
		boolean actual = s.logon(userId, password); boolean expected = false;
		assertEquals(expected, actual); 
		// assertFalse(actual);   // can also use this assert }
	}
	@Test 
	public void testLogonTooShortPassword() {
		String userId = "Simon"; String password = "passwrd"; Security s = new Security();
		boolean actual = s.logon(userId, password); boolean expected = false;
		assertEquals(expected, actual); 
		// assertFalse(actual);   // can also use this assert }
	}
	@Test 
	public void testLogon() {
		String userId = "Simon"; String password = "Freddy99"; Security s = new Security();
		boolean actual = s.logon(userId, password); boolean expected = true;
		assertEquals(expected, actual); 
		// assertFalse(actual);   // can also use this assert }
	}
	

}
