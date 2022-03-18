public class InsertionSort {

	/*
	 * uncomment printArray(array); to follow the sorting steps. But It will affect
	 * the Performance
	 */

	private InsertionSort() {
	}

	public static void InSort(int[] array) {
		// printArray(array);
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			/*
			 * Move elements of array[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
			// printArray(array);
		}
		// printArray(array);
	}

	private static void printArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : array) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder);
	}

}
