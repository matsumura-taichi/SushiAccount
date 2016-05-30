package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testRedPlate() {
		Account account = new Account();

		account.addResPlate();

		assertEquals(100, account.getTotalPrice());
	}

}
