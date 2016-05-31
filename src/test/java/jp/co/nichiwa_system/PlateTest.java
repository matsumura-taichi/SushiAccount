package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateTest {

	@Test
	public void testGetPriceRed(){
		Plate plate = Plate.createRedPlate();
		assertEquals(100, plate.getPrice());
	}

	@Test
	public void testGetPriceBlue(){
		Plate plate = Plate.createBluePlate();
		assertEquals(300, plate.getPrice());
	}

	@Test
	public void testGetPriceYellow(){
		Plate plate = Plate.createYellowPlate();
		assertEquals(450, plate.getPrice());
	}

}
