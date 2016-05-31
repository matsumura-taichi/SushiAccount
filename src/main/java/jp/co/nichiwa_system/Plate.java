package jp.co.nichiwa_system;

public class Plate {

	private String type;

	private Plate(String type) {
		this.type = type;
	}

	public int getPrice() {
		switch (type) {
		case "RED":
			return 100;
		case "BLUE":
			return 300;
		case "YELLOW":
			return 450;
		default:
			return 0;
		}
	}

	public static Plate createRedPlate() {
		return new Plate("RED");
	}

	public static Plate createBluePlate() {
		return new Plate("BLUE");
	}

	public static Plate createYellowPlate() {
		return new Plate("YELLOW");
	}
}
