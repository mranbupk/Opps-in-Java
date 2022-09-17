package co.anbu.entity;

public class Customer {
	private int custId;
	private String name;
	Address address;
	SimpleDate registrationDate;

	public Customer(int custId, String name, Address address, SimpleDate regitrationDate) {
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.registrationDate = regitrationDate;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public SimpleDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(SimpleDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Id : " + custId + ", Name : " + name + "\nAddress : " + address + "\nRegistered On : "
				+ registrationDate;
	}

}
