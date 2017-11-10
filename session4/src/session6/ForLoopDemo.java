package session6;

/*
 * This class will provide the numbers divisible by 3 or 5 in a range of numbers
 */

public class ForLoopDemo {

	public void nmbrsDivByFiveAndThree(int range) {
		System.out.println("Using for loop method");
		for (int i = 1; i <= range; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------");
	}

	public void divByFiveAndThree(int range) {
		System.out.println("Using While method");
		int i = 1;
		while (i <= range) {

			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-------------------------------------");
	}

}
