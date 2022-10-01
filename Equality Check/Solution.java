package co.anbu;

import java.util.Objects;

public class Customer {
	int customerId;
	String name;
	String city;
	String phone;
	String email;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name, String city, String phone, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, customerId, email, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && customerId == other.customerId && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

}

package co.anbu.entity;

import co.anbu.Customer;

public class Solution {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));

		c1.setEmail("vinod@mailnator.com");
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));

		c2.setEmail("vinod@mailnator.com");
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));

		Customer c3 = new Customer();
		Customer c4 = new Customer();
		System.out.println(c3.equals(c4));
	}

}
