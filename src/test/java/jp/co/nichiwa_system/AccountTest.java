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

	@Test
	public void testBlueOneAndYellowTwo() {
		account.addBluePlate();
		account.addYellowPlate();
		account.addYellowPlate();
		assertEquals(1200, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueOneAndYellowOne() {
		account.addRedPlate();
		account.addBluePlate();
		account.addYellowPlate();
		assertEquals(850, account.getTotalPrice());
	}

	@Test
	public void testRed5AndBlue10AndYellow4() {

		for(int i = 0; i < 5; i++) {
			account.addRedPlate();
		}

		for(int i = 0; i < 10; i++) {
			account.addBluePlate();
		}

		for(int i = 0; i < 4; i++) {
			account.addYellowPlate();
		}

		assertEquals(5300, account.getTotalPrice());
	}
}
