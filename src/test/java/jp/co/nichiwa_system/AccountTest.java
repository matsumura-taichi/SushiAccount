package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account account = new Account();

	@Test
	public void testRedPlate() {
		account.addRedPlate(1, true);
		assertEquals(100, account.getTotalPrice());

		account.addRedPlate(1, true);
		assertEquals(200, account.getTotalPrice());
	}

	@Test
	public void testBluePlate() {
		account.addBluePlate(1, true);
		assertEquals(300, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueTwo() {
		account.addRedPlate(1, true);
		account.addBluePlate(1, true);
		account.addBluePlate(1, true);
		assertEquals(700, account.getTotalPrice());
	}

	@Test
	public void testYellowPlate() {
		account.addYellowPlate(1, true);
		assertEquals(450, account.getTotalPrice());
	}

	@Test
	public void testBlueOneAndYellowTwo() {
		account.addBluePlate(1, true);
		account.addYellowPlate(1, true);
		account.addYellowPlate(1, true);
		assertEquals(1200, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueOneAndYellowOne() {
		account.addRedPlate(1, true);
		account.addBluePlate(1, true);
		account.addYellowPlate(1, true);
		assertEquals(850, account.getTotalPrice());
	}

	@Test
	public void testRed5AndBlue10AndYellow4() {

		for(int i = 0; i < 5; i++) {
			account.addRedPlate(1, true);
		}

		for(int i = 0; i < 10; i++) {
			account.addBluePlate(1, true);
		}

		for(int i = 0; i < 4; i++) {
			account.addYellowPlate(1, true);
		}

		assertEquals(5300, account.getTotalPrice());
	}

	@Test
	public void testComplex() {

		account.addRedPlate(1, true);
		account.addBluePlate(1, true);
		account.addBluePlate(1, true);
		account.addBluePlate(1, true);
		account.addYellowPlate(1, true);

		account.addRedPlate(2, true);
		account.addRedPlate(2, true);

		account.addRedPlate(3, true);

		account.addBluePlate(4, true);
		account.addBluePlate(4, true);

		account.addYellowPlate(5, true);
		account.addYellowPlate(5, true);

		account.addBluePlate(9, true);

		account.addYellowPlate(10, true);
		account.addYellowPlate(10, true);

		account.addRedPlate(15, true);

		assertEquals(4230, account.getTotalPrice());
	}

	public void testDessert() {
		account.addBluePlate(10, false);
		assertEquals(300, account.getTotalPrice());
	}

	public void testJuice() {
		account.addBluePlate(8, false);
		assertEquals(100, account.getTotalPrice());
	}
}
