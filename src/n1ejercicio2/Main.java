package n1ejercicio2;

public class Main {

	public static void main(String[] args) {

		byte inputByte = Input.readByte("Introduce un byte:");
		System.out.println("Has introducido el byte: " + inputByte);

		int inputInt = Input.readInt("Introduce un int:");
		System.out.println("Has introducido el int: " + inputInt);

		float inputFloat = Input.readFloat("Introduce un float:");
		System.out.println("Has introducido el float: " + inputFloat);

		double inputDouble = Input.readDouble("Introduce un double:");
		System.out.println("Has introducido el double: " + inputDouble);

	}

}
