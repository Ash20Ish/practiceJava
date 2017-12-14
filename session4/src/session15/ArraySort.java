package session15;

public class ArraySort {
	// This method provides bubble sorting of int array in ascending order
	public void sortIntArrayAsc(int[] ary) {
		int temp;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j < (ary.length - i); j++) {
				if (ary[j - 1] > ary[j]) {
					temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
				}
			}
		}
	}

	// This method provides bubble sorting of int array in descending order
	public void sortIntArrayDsc(int[] ary) {
		int temp;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j < (ary.length - i); j++) {
				if (ary[j - 1] < ary[j]) {
					temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
				}
			}
		}
	}

	// This method provides bubble sorting of string array in Ascending order
	public void sortStrArrayAsc(String[] array) {
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1].compareTo(array[j]) > 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	// This method provides bubble sorting of string array in Descending order
	public void sortStrArrayDsc(String[] array) {
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1].compareTo(array[j]) < 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
