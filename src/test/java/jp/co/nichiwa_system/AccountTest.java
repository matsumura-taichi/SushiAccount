package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account account = new Account();

	@Test
	public void testRedPlate() {
		account.addRedPlate(1);
		assertEquals(100, account.getTotalPrice());

		account.addRedPlate(1);
		assertEquals(200, account.getTotalPrice());
	}

	@Test
	public void testBluePlate() {
		account.addBluePlate(1);
		assertEquals(300, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueTwo() {
		account.addRedPlate(1);
		account.addBluePlate(1);
		account.addBluePlate(1);
		assertEquals(700, account.getTotalPrice());
	}

	@Test
	public void testYellowPlate() {
		account.addYellowPlate(1);
		assertEquals(450, account.getTotalPrice());
	}

	@Test
	public void testBlueOneAndYellowTwo() {
		account.addBluePlate(1);
		account.addYellowPlate(1);
		account.addYellowPlate(1);
		assertEquals(1200, account.getTotalPrice());
	}

	@Test
	public void testRedOneAndBlueOneAndYellowOne() {
		account.addRedPlate(1);
		account.addBluePlate(1);
		account.addYellowPlate(1);
		assertEquals(850, account.getTotalPrice());
	}

	@Test
	public void testRed5AndBlue10AndYellow4() {

		for(int i = 0; i < 5; i++) {
			account.addRedPlate(1);
		}

		for(int i = 0; i < 10; i++) {
			account.addBluePlate(1);
		}

		for(int i = 0; i < 4; i++) {
			account.addYellowPlate(1);
		}

		assertEquals(5300, account.getTotalPrice());
	}

	@Test
	public void testComplex() {

		account.addRedPlate(1);
		account.addBluePlate(1);
		account.addBluePlate(1);
		account.addBluePlate(1);
		account.addYellowPlate(1);

		account.addRedPlate(2);
		account.addRedPlate(2);

		account.addRedPlate(3);

		account.addBluePlate(4);
		account.addBluePlate(4);

		account.addYellowPlate(5);
		account.addYellowPlate(5);

		account.addBluePlate(9);

		account.addYellowPlate(10);
		account.addYellowPlate(10);

		account.addRedPlate(15);

		assertEquals(4230, account.getTotalPrice());
	}
}
