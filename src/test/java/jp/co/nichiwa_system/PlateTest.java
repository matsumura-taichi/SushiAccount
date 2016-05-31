package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateTest {

	@Test
	public void testGetPriceRed(){
		Plate plate = Plate.createRedPlate(1);
		assertEquals(100, plate.getPrice());
	}

	@Test
	public void testGetPriceBlue(){
		Plate plate = Plate.createBluePlate(1);
		assertEquals(300, plate.getPrice());
	}

	@Test
	public void testGetPriceYellow(){
		Plate plate = Plate.createYellowPlate(1);
		assertEquals(450, plate.getPrice());
	}

}
