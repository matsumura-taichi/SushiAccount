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

	@Test
	public void testRedOneAndBlueTwo() {
		Account account = new Account();

		account.addRedPlate();
		account.addBluePlate();
		account.addBluePlate();
		assertEquals(700, account.getTotalPrice());
	}

	@Test
	public void testYellowPlate() {
		Account account = new Account();

		account.addYellowPlate();
		assertEquals(450, account.getTotalPrice());
	}
}
