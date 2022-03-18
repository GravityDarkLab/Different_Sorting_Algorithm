import java.util.Random;

public class Main {

	private static int[] initialise() {
		Random random = new Random();
		int[] tab = new int[150];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(9999);
		}
		return tab;
	}

	public static void main(String[] args) {
		int[] arrayB = initialise();
		int[] arrayI = initialise();
		int[] arrayM = initialise();
		int[] arrayQ = initialise();
		int[] arrayS = initialise();
		int[] arrayR = initialise();

		/*-----Printing the random Arrays-------*/
		print(arrayB, arrayI, arrayM, arrayQ, arrayS, arrayR);

		/* -----------BubbleSort------------ */
		long start = System.nanoTime();
		BubbleSort.BSort(arrayB);
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("BubbleSort: " + timeElapsed + "ns");

		/* ----------InsertionSort------------- */
		start = System.nanoTime();
		InsertionSort.InSort(arrayI);
		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("InsertionSort: " + timeElapsed + "ns");

		/* ----------SelectionSort------------- */
		start = System.nanoTime();
		SelectionSort.SSort(arrayS);
		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("SelectionSort: " + timeElapsed + "ns");

		/* ----------MergeSort------------- */
		MergeSort.setArray(arrayM);
		start = System.nanoTime();
		MergeSort.MSort(0, arrayM.length - 1);
		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("MergeSort: " + timeElapsed + "ns");

		/* ----------QuickSort------------- */
		start = System.nanoTime();
		QuickSort.Qsort(arrayQ, 0, arrayQ.length - 1);
		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("QuickSort: " + timeElapsed + "ns");

		/* ----------RadixSort------------- */
		start = System.nanoTime();
		RadixSort.Rsort(arrayR, arrayR.length);
		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("RadixSort: " + timeElapsed + "ns");

		/*-------Printing the Result--------*/
		print(arrayB, arrayI, arrayM, arrayQ, arrayS, arrayR);
	}

	private static void printArray(int[] tab) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : tab) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder);
	}
	private static void print(int[] arrayB, int[] arrayI, int[] arrayM, int[] arrayQ, int[] arrayS, int[] arrayR) {
		System.out.print("arrayB: ");
		printArray(arrayB);
		System.out.print("arrayI: ");
		printArray(arrayI);
		System.out.print("arrayS: ");
		printArray(arrayS);
		System.out.print("arrayM: ");
		printArray(arrayM);
		System.out.print("arrayQ: ");
		printArray(arrayQ);
		System.out.print("arrayR: ");
		printArray(arrayR);
	}

}
