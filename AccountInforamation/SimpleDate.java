package co.anbu.entity;

public class SimpleDate {
	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		if (validateDate(this) == true) {
			setDate(day, month, year);
		}
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		if (validateDate(this) != true) {
			return "Unknown";
		}
		return (getDay() + "/" + getMonth() + "/" + getYear());

	}

	private boolean validateDate(SimpleDate d) {
		int day = d.getDay();
		int month = d.getMonth();
		int year = d.getYear();
		if (year >= 2000) {
			if (month >= 1 && month <= 12) {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day >= 1 && day <= 31) {
						return true;
					}
				}
				if (month == 2) {
					if (day >= 1 && day <= 28) {
						return true;
					}
				}
				if (month == 4 || month == 6 || month == 8 || month == 11) {
					return true;
				}
			}
		}
		return false;
	}
}
