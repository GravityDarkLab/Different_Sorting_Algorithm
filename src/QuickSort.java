public class QuickSort {

    /*
     * uncomment printArray(array); to follow the sorting steps. But It will affect
     * the Performance
     */

    private QuickSort() {
    }

    public static void Qsort(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            // printArray(array);
        }
        if (low < j) {
            Qsort(array, low, j);
        }
        if (high > i) {
            Qsort(array, i, high);
        }
    }

    private static void printArray(int[] tab) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : tab) {
            stringBuilder.append(j).append(" | ");
        }
        System.out.println(stringBuilder);
    }
}
