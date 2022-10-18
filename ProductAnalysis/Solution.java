#ProductAnalysis.java

package co.anbu.entity;

import java.util.Scanner;
import co.anbu.entity.ProductService;

public class ProductAnalysis {

	public static void main(String[] args) {
		ProductService p1 = new ProductService();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			int code = sc.nextInt();
			if (p1.findNameByCode(code) == null) {
				System.out.println("Product Not Found");
			} else {
				System.out.println(p1.findNameByCode(code));
			}
		} else if (n == 2) {
			sc.nextLine();
			String category = sc.nextLine();
			if (p1.findMaxPriceProduct(category) == null) {
				System.out.println("Product Not Found or Invalid Input");
			} else {
				System.out.println(p1.findMaxPriceProduct(category));
			}
		} else {
			System.out.println("Invalid Input");
		}
	}
}

#Product.java

package co.anbu.entity;

public class Product {
	private int prodCode;
	private String prodName;
	private double price;
	private String category;
	
	public Product(int prodCode, String prodName, double price, String category) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.price = price;
		this.category = category;
	}

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

#ProductData.java
package co.anbu.entity;

public class ProductData {
	private static Product[] products;
	
	static {
		products = new Product[8];
		products[0] = new Product(101, "keyboard", 300, "computers");
		products[1] = new Product(102, "mouse", 600, "computers");
		products[2] = new Product(103, "monitor", 5000, "computers");
		products[3] = new Product(104, "t-shirt", 500, "clothing");
		products[4] = new Product(105, "jeans", 2000, "clothing");
		products[5] = new Product(106, "sweater", 1000, "clothing");
		products[6] = new Product(107, "doll", 500, "toys");
		products[7] = new Product(108, "car", 1000, "toys");
	}

	public static Product[] getProducts() {
		return products;
	}

}

#ProductService.java
package co.anbu.entity;

import co.anbu.entity.Product;
import co.anbu.entity.ProductData;

public class ProductService {

	public static String findNameByCode(int code) {
		Product products[] = ProductData.getProducts();
		for (Product p : products) {
			if (p.getProdCode() == code) {
				return p.getProdName();
			}
		}
		return null;
	}

	public static String findMaxPriceProduct(String category) {
		double cost = 0;
		Product products[] = ProductData.getProducts();
		for (Product p : products) {
			if (p.getCategory().equalsIgnoreCase(category)) {
				if (p.getPrice() > cost) {
					cost = p.getPrice();
				}
			}
		}
		for (Product p : products) {
			if (p.getPrice() == cost) {
				return p.getProdCode() + " | " + p.getProdName() + " | " + p.getPrice();
			}
		}
		return null;
	}

}


