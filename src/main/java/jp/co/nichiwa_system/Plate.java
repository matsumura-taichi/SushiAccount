package jp.co.nichiwa_system;

public class Plate {

	private static final String TYPE_RED = "RED";
	private static final String TYPE_BLUE = "BLUE";
	private static final String TYPE_YELLOW = "YELLOW";

	private String type;

	private Plate(String type) {
		this.type = type;
	}

	public int getPrice() {
		switch (type) {
		case TYPE_RED:
			return 100;
		case TYPE_BLUE:
			return 300;
		case TYPE_YELLOW:
			return 450;
		default:
			return 0;
		}
	}

	public static Plate createRedPlate(int lap) {
		return new Plate(TYPE_RED);
	}

	public static Plate createBluePlate(int lap) {
		return new Plate(TYPE_BLUE);
	}

	public static Plate createYellowPlate(int lap) {
		return new Plate(TYPE_YELLOW);
	}
}
