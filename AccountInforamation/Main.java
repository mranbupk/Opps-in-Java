package co.anbu;

import java.util.Scanner;

import co.anbu.entity.Address;
import co.anbu.entity.Customer;
import co.anbu.entity.SimpleDate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter The Name : ");
		String name = sc.nextLine();
		System.out.print("Enter The Area : ");
		String area = sc.nextLine();
		System.out.print("Enter The City : ");
		String city = sc.nextLine();
		System.out.print("Enter The Day : ");
		int day = sc.nextInt();
		System.out.print("Enter The Month : ");
		int month =sc.nextInt();
		System.out.print("Enter The Year : ");
		int year = sc.nextInt();
		Address a1 = new Address(area, city);
		SimpleDate d1 = new SimpleDate(day, month, year);
		Customer c1 = new Customer(id, name, a1, d1);
		System.out.println(c1.toString());
	}

}
