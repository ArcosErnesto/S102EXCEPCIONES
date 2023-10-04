package n1ejercicio1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Venta 1:");
		Sale venta1 = new Sale();

		try {
			venta1.calculateTotal();
		} catch (EmptySaleException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Venta 2:");
		Sale venta2 = new Sale();

		Product producto1 = new Product("prod1", 19.99);
		Product producto2 = new Product("prod2", 15.45);

		venta2.addProduct(producto1);
		venta2.addProduct(producto2);

		try {
			venta2.calculateTotal();
		} catch (EmptySaleException e) {
			System.out.println(e.getMessage());
		}

	}

}
