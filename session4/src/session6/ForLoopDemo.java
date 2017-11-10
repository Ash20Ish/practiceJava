package session6;

/*
 * This class will provide the numbers divisible by 3 or 5 in a range of numbers
 */

public class ForLoopDemo {

	public void nmbrsDivByFiveAndThree(int range) {
		for (int i = 1; i <= range; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}

}
