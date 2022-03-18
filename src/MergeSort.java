public class MergeSort {

	/*
	 * uncomment printArray(array); to follow the sorting steps. But It will affect
	 * the Performance
	 */

	private static int[] array;

	private MergeSort() {
	}

	public static void MSort(int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			MSort(first, mid);
			MSort(mid + 1, last);
			merge(first, last, mid);
		}
	}

	private static void merge(int first, int last, int mid) {
		int[] sort = new int[array.length];
		int i, j;
		for (i = first; i <= mid; i++) {
			sort[i] = array[i];
		}
		// printArray(sort);
		for (j = mid + 1; j <= last; j++) {
			sort[last + mid + 1 - j] = array[j];
		}
		// printArray(sort);
		i = first;
		j = last;
		for (int k = i; k <= last; k++) {
			if (sort[i] <= sort[j]) {
				array[k] = sort[i];
				i++;
			} else {
				array[k] = sort[j];
				j--;
			}
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

	public static void setArray(int[] array) {
		MergeSort.array = array;
	}
}
