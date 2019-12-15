package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(Double a, Double b) throws IllegalArgumentException{
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		
		return a/b;
	}
	public static String reverseString(String a) throws IllegalStateException{
		String newString = "";
		if (a.length() == 0) {
			throw new IllegalStateException();
		}
		for (int i = a.length() - 1; i >= 0; i--) {
			newString += a.substring(i, i+1);
		}
		return newString;
	}
}
