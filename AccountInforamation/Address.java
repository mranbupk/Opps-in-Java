package co.anbu.entity;

public class Address {
	private String area;
	private String city;

	public Address(String area, String city) {
		this.area = area;
		this.city = city;
		if (validateAddress(this) == true) {
			this.area = area;
			this.city = city;
		}
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		if (validateAddress(this) == true) {
			return "Unknown";
		}
		return area + ", " + city;
	}

	public static boolean validateAddress(Address s) {
		String area = s.area;
		String city = s.city;

		if (area.trim().isEmpty() || city.trim().isEmpty() || area.length() == 0 || city.length() == 0) {
			return true;
		}
		return false;
	}

}
