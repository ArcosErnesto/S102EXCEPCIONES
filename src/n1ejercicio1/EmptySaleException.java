package n1ejercicio1;

public class EmptySaleException extends Exception {

	public EmptySaleException() {
		super("Para hacer una venta primero has de añadir productos");
	}

}
