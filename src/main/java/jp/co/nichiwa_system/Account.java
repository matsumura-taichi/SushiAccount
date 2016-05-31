package jp.co.nichiwa_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {

	private List<Plate> plateList = new ArrayList<Plate>();

	public int getTotalPrice() {
		int totalPrice = 0;
		Iterator<Plate> it = plateList.iterator();
		while (it.hasNext()){
			Plate plate = (Plate)it.next();
			totalPrice += plate.getPrice();
		}
		return totalPrice;
	}

	public void addRedPlate() {
		plateList.add(Plate.createRedPlate());
	}

	public void addBluePlate() {
		plateList.add(Plate.createBluePlate());
	}

	public void addYellowPlate() {
		plateList.add(Plate.createYellowPlate());
	}

}
