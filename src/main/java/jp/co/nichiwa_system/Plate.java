package jp.co.nichiwa_system;

public class Plate {

	private String type;

	public Plate(String type) {
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
}
