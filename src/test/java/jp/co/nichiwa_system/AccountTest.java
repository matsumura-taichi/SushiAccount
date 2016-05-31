package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testRedPlate() {
		Account account = new Account();

		account.addRedPlate();
		assertEquals(100, account.getTotalPrice());

		account.addRedPlate();
		assertEquals(200, account.getTotalPrice());
	}

	@Test
	public void testBluePlate() {
		Account account = new Account();

		account.addBluePlate();
		assertEquals(300, account.getTotalPrice());
	}

}
