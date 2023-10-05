package n2ejercicio1;

public class Main {

	public static void main(String[] args) throws Exception {

		byte inputByte = Input.readByte("Introduce un byte:");
		System.out.println("Has introducido el byte: " + inputByte);

		int inputInt = Input.readInt("Introduce un int:");
		System.out.println("Has introducido el int: " + inputInt);

		float inputFloat = Input.readFloat("Introduce un float:");
		System.out.println("Has introducido el float: " + inputFloat);

		double inputDouble = Input.readDouble("Introduce un double:");
		System.out.println("Has introducido el double: " + inputDouble);

		char inputChar = Input.readChar("Introduce un char:");
		System.out.println("Has introducido el char: " + inputChar);

		String inpuString = Input.readString("Introduce un string:");
		System.out.println("Has introducido el string: " + inpuString);

		boolean yesNo = Input.readYesNo("Introduce si o no:");
		if (yesNo) {
			System.out.println("Has introducido: Si");
		} else {
			System.out.println("Has introducido: No");
		}

	}

}
