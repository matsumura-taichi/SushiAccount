package jp.co.nichiwa_system;

public class Plate {

	private static final String TYPE_RED = "RED";
	private static final String TYPE_BLUE = "BLUE";
	private static final String TYPE_YELLOW = "YELLOW";

	private String type;
	private int lap;

	private Plate(String type, int lap) {
		this.type = type;
		this.lap = lap;
	}

	public double getPrice() {
		double price = 0;

		if (type.equals(TYPE_RED)) {
			price = 100;
		} else if (type.equals(TYPE_BLUE)) {
			price = 300;
		} else if (type.equals(TYPE_YELLOW)) {
			price = 450;
		}

		return calcDiscount(price);
	}

	private double calcDiscount(double price) {
		if(lap >= 5 && lap <= 9) {
			price = price * 0.9;
		} else if(lap >= 10) {
			price = price * 0.8;
		}
		return price;
	}

	public static Plate createRedPlate(int lap) {
		return new Plate(TYPE_RED, lap);
	}

	public static Plate createBluePlate(int lap) {
		return new Plate(TYPE_BLUE, lap);
	}

	public static Plate createYellowPlate(int lap) {
		return new Plate(TYPE_YELLOW, lap);
	}
}
