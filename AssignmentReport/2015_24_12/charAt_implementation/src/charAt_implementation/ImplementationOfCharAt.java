package charAt_implementation;

public class ImplementationOfCharAt {

	static String str = "Neha Bansal";

	public static void main(String[] args) {
		char output = charAt(4);
		System.out.println(output);
	}

	public static char charAt(int index) {
		if (index < 0 || index > str.length()) {
			throw new StringIndexOutOfBoundsException();
		}
		String string = str.substring(index, (index + 1));
		char charArray[] = string.toCharArray();
		return charArray[0];

	}


}
