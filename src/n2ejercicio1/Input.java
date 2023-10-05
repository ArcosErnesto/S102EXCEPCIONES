package n2ejercicio1;

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
				sc.nextLine();
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
				sc.nextLine();
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
				sc.nextLine();
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
				inputDouble = sc.nextDouble();
				sc.nextLine();
				isDouble = true;
			} catch (InputMismatchException e) {
				System.out.println("Error de formato");
				sc.nextLine();
			}
		}
		return inputDouble;

	}

	public static char readChar(String textChar) throws Exception {
		boolean isChar = false;
		char inputChar = '0';
		String inputString;

		while (!isChar) {
			try {
				System.out.println(textChar);
				inputString = sc.nextLine();

				if (inputString.length() > 1) {
					throw new Exception();
				} else {
					inputChar = inputString.charAt(0);
					isChar = true;
				}
			} catch (Exception e) {
				System.out.println("Error de formato.");
			}
		}
		return inputChar;
	}

	public static String readString(String textString) throws Exception {
		boolean isString = false;
		String inputString = "";

		while (!isString) {
			try {
				System.out.println(textString);
				inputString = sc.nextLine();

				if (inputString.isBlank()) {
					throw new Exception();
				} else {
					isString = true;
				}
			} catch (Exception e) {
				System.out.println("Error de formato.");
			}
		}

		return inputString;
	}

	public static boolean readYesNo(String textYesNo) throws Exception {
		boolean isYesNo = false;
		boolean yesNo = false;
		String inputYesNo;
		char charYesNo;

		while (!isYesNo) {
			try {
				System.out.println(textYesNo);
				inputYesNo = sc.nextLine();
				inputYesNo = inputYesNo.toLowerCase();
				charYesNo = inputYesNo.charAt(0);

				if (charYesNo == 's') {
					yesNo = true;
					isYesNo = true;
				} else if (charYesNo == 'n') {
					yesNo = false;
					isYesNo = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Error de formato.");
			}
		}

		return yesNo;
	}

}