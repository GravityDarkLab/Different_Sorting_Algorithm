public class BubbleSort {

	/*
	 * uncomment printArray(tab); to follow the sorting steps. But It will affect
	 * the Performance
	 */

	private BubbleSort() {
	}

	public static void BSort(int[] array) {
		//// printArray(array);
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					// printArray(array);
				}
			}
		}
	}
	private static void printArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : array) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder);
	}
}
