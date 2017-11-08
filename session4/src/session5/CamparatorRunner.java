package session5;

public class CamparatorRunner {

	public static void main(String[] args) {

		CompareValue cv = new CompareValue();
		cv.great(10, 15, 20, 1, 3);
		cv.low(10, 15, 20, 1, 3);
		int[] nmbrs = { 1, -4, 20, 8, 30, 6, 10 };
		cv.maxValue(nmbrs);
		cv.minValue(nmbrs);

	}

}
