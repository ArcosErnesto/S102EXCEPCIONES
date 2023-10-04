package n1ejercicio1;

import java.util.ArrayList;

public class Sale {
	private ArrayList<Product> products;
	private double totalPrice;

	public Sale() {
		this.products = new ArrayList<>();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void calculateTotal() throws EmptySaleException {
		if (products.isEmpty()) {
			throw new EmptySaleException();
		} else {
			totalPrice = 0.0;
			for (int i = 0; i < products.size(); i++) {
				totalPrice += products.get(i).getPrice();
			}
			System.out.println("El precio total de la venta es: " + totalPrice);
		}
	}

	@Override
	public String toString() {
		return "Sale [products=" + products + ", totalPrice=" + totalPrice + "]";
	}

}
