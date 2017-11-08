package session4;

public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int substract(int i, int j) {
		return i - j;
	}

	public int multiply(int i, int j) {
		return i * j;
	}

	public double divide(int i, int j) {

		if (j > 0) {
			return i * 1.0 / j;
		} else {
			return 0;
		}
	}

	public int mod(int i, int j) {
		if (j > 0) {
			return i % j;
		} else {
			return 0;
		}
	}
}
