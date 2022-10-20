package co.anbu.entity;

public interface Shape {
	double getArea();

	double getPerimeter();
}

public abstract class AbstractShape implements Shape {
	public String colour;

	public AbstractShape(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "colour=" + colour;
	}
}


public class Circle extends AbstractShape {
	static double Pi = Math.PI;
	private int r;

	public Circle(String colour, int radius) {
		super(colour);
		this.r = radius;
	}

	@Override
	public double getArea() {
		return Pi * r * r;
	}

	@Override
	public double getPerimeter() {
		return 2 * Pi * r;
	}

	@Override
	public String toString() {
		return "Circle [colour=" + colour.toUpperCase() + ", radius=" + r + "]";
	}
}

public class Circle extends AbstractShape {
	static double Pi = Math.PI;
	private int r;

	public Circle(String colour, int radius) {
		super(colour);
		this.r = radius;
	}

	@Override
	public double getArea() {
		return Pi * r * r;
	}

	@Override
	public double getPerimeter() {
		return 2 * Pi * r;
	}

	@Override
	public String toString() {
		return "Circle [colour=" + colour.toUpperCase() + ", radius=" + r + "]";
	}
}


<---------- Main Class ------------>

package co.anbu;

import java.util.Scanner;

import co.anbu.entity.AbstractShape;
import co.anbu.entity.Circle;
import co.anbu.entity.Rectangle;
import co.anbu.entity.Shape;

public class Solution {
	public static void printShape(AbstractShape a) {
		System.out.println(a);
		System.out.println(
				"Area: " + (int) Math.round(a.getArea()) + ", Perimeter= " + (int) Math.round(a.getPerimeter()));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shape = sc.nextLine();
		if (shape.equalsIgnoreCase("CIRCLE")) {
			String colour = sc.nextLine();
			int radius = sc.nextInt();

			Circle one = new Circle(colour, radius);
			printShape(one);
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			String colour = sc.nextLine();
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			Rectangle one = new Rectangle(colour, length, breadth);
			printShape(one);

		} else {
			System.out.println("Invalid Input");
		}
	}
}
