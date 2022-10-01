package co.anbu.entity;

public class Calculation {

	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public void fahrenheitToCelcius(double farenheit) {
		double celcious = (((farenheit - 32) * 5) / 9);
		System.out.println(Math.round(celcious));
	}

	public void getLevel(int[] elements) {
		int sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		if (sum >= 100) {
			System.out.println("HIGH");
		} else if (sum >= 70) {
			System.out.println("MEDIUM");
		} else if (sum < 70) {
			System.out.println("LOW");
		}
	}
}


package co.anbu;

import java.util.Scanner;
import co.anbu.entity.Calculation;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Enter 1 for Farenheit to Celcious Conversion \nEnter 2 for Get Temperature Level \nOptions(1 or 2) : ");
		int method = sc.nextInt();
		Calculation obj1 = new Calculation();
		if (method == 1) {
			System.out.print("Enter the Farenheit : ");
			double farenheit = sc.nextDouble();
			obj1.fahrenheitToCelcius(farenheit);
		} else if (method == 2) {
			System.out.print("Enter the Number of Element in the Array : ");
			int n = sc.nextInt();
			int[] elements = new int[n];
			for (int i = 0; i < n; i++) {
				elements[i] = sc.nextInt();
			}
			obj1.getLevel(elements);
		} else {
			System.out.println("Invalid Input");
		}

	}

}
