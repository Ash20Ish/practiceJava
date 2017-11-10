package session6;

public class ForLoopDemo {

	public void nmbrsDivByFiveAndThree(int range) {
		for (int i = 1; i <= range; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
