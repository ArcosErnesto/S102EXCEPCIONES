package n1ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	public static byte readByte(String textByte) {
		boolean isByte = false;
		byte inputByte = 0;

		while (!isByte) {
			try {
				System.out.println(textByte);
				inputByte = sc.nextByte();
				isByte = true;
			} catch (InputMismatchException e) {
				System.out.println("Error de formato");
				sc.nextLine();
			}
		}
		return inputByte;
	}

	public static int readInt(String textInt) {
		boolean isInt = false;
		int inputInt = 0;

		while (!isInt) {
			try {
				System.out.println(textInt);
				inputInt = sc.nextInt();
				isInt = true;
			} catch (InputMismatchException e) {
				System.out.println("Error de formato");
				sc.nextLine();
			}
		}

		return inputInt;
	}

	public static float readFloat(String textFloat) {
		boolean isFloat = false;
		float inputFloat = 0;

		while (!isFloat) {
			try {
				System.out.println(textFloat);
				inputFloat = sc.nextFloat();
				isFloat = true;
			} catch (InputMismatchException e) {
				System.out.println("Error de formato");
				sc.nextLine();
			}
		}
		return inputFloat;
	}

	public static double readDouble(String textDouble) {
		boolean isDouble = false;
		double inputDouble = 0;

		while (!isDouble) {
			try {
				System.out.println(textDouble);
				inputDouble = sc.nextFloat();
				isDouble = true;
			} catch (InputMismatchException e) {
				System.out.println("Error de formato");
				sc.nextLine();
			}
		}
		return inputDouble;

	}

}