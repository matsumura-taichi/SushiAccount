package jp.co.nichiwa_system;

public class Plate {

	private static final String TYPE_RED = "RED";
	private static final String TYPE_BLUE = "BLUE";
	private static final String TYPE_YELLOW = "YELLOW";
	private static final String TYPE_SILVER = "SILVER";
	private static final String TYPE_GOLD = "GOLD";

	private String type;
	private int lap;
	private boolean isDiscount;

	private Plate(String type, int lap, boolean isDiscount) {
		this.type = type;
		this.lap = lap;
		this.isDiscount = isDiscount;
	}

	public double getPrice() {
		double price = 0;

		if (type.equals(TYPE_RED)) {
			price = 100;
		} else if (type.equals(TYPE_BLUE)) {
			price = 300;
		} else if (type.equals(TYPE_YELLOW)) {
			price = 450;
		} else if (type.equals(TYPE_SILVER)) {
			price = 550;
		} else if (type.equals(TYPE_GOLD)) {
			price = 700;
		}

		return calcDiscount(price);
	}

	private double calcDiscount(double price) {
		if(isDiscount) {
		if(lap >= 5 && lap <= 9) {
			price = price * 0.9;
		} else if(lap >= 10) {
			price = price * 0.8;
		}
		}
		return price;
	}

	public static Plate createRedPlate(int lap, boolean isDiscount) {
		return new Plate(TYPE_RED, lap, isDiscount);
	}

	public static Plate createBluePlate(int lap, boolean isDiscount) {
		return new Plate(TYPE_BLUE, lap, isDiscount);
	}

	public static Plate createYellowPlate(int lap, boolean isDiscount) {
		return new Plate(TYPE_YELLOW, lap, isDiscount);
	}

	public static Plate createSilverPlate(int lap, boolean isDiscount) {
		return new Plate(TYPE_SILVER, lap, isDiscount);
	}

	public static Plate createGoldPlate(int lap, boolean isDiscount) {
		return new Plate(TYPE_GOLD, lap, isDiscount);
	}
}
