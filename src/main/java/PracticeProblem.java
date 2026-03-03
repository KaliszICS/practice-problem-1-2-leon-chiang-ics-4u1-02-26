public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] x, int y) {
		try {
			x[y]=0;
		}
		catch (ArrayIndexOutOfBoundsException aIE) {
			return false;
		}
		return true;
	}

	public static int divide(int x, int y) {
		try {
			return x/y;
		}
		catch (ArithmeticException aE) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String x) {
		try {
			return Integer.parseInt(x);
		}
		catch (NumberFormatException nFE) {
			return 0;
		}
	}

	

}
