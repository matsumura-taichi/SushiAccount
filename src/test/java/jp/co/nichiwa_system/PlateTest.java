package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateTest {

	@Test
	public void testGetPriceRed(){
		Plate plate = new Plate("RED");
		assertEquals(100, plate.getPrice());
	}

	@Test
	public void testGetPriceBlue(){
		Plate plate = new Plate("BLUE");
		assertEquals(300, plate.getPrice());
	}

	@Test
	public void testGetPriceYellow(){
		Plate plate = new Plate("YELLOW");
		assertEquals(450, plate.getPrice());
	}

}
