package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account account = new Account();

	@Test
	public void testRedPlate() {
		account.addRedPlate();
		assertEquals(100, account.getTotalPrice());

		account.addRedPlate();
		assertEquals(200, account.getTotalPrice());
	}

	@Test
	public void testBluePlate() {
		account.addBluePlate();
		assertEquals(300, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueTwo() {
		account.addRedPlate();
		account.addBluePlate();
		account.addBluePlate();
		assertEquals(700, account.getTotalPrice());
	}

	@Test
	public void testYellowPlate() {
		account.addYellowPlate();
		assertEquals(450, account.getTotalPrice());
	}
}
