package exam5;

public class Sorter {

	/**
	 * Exchanges the ith position element with the jth element in the array
	 * 
	 * @param i
	 * @param j
	 * @param arr
	 */
	public static void exchg(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Checks if the ith element is less than the jth element for that array.
	 * 
	 * @param i
	 * @param j
	 * @param arr
	 * @return
	 */
	public static boolean less(int i, int j, int[] arr) {
		return arr[i] < arr[j];
	}

	public static void bubbleSort(int[] array) {
		// TODO
		/**
		 * Complete this method and test it using the supplied Tester check each element
		 * with the one succeeding it. If it is larger, swap their positions. Repeat
		 * until there are no more swaps.
		 */

		boolean swapped = true;
		int count = 0;
		
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1 - count; i++) {
				if (less(i + 1, i, array)) {
					exchg(i + 1, i, array);
					swapped = true;
				}
			}
			count++;
		} while (swapped);

	}

	public static void cocktailShakerSort(int[] array) {
		boolean swapped = true;
		int count = 0;

		do {
			swapped = false;
			for (int i = count; i < array.length - 1 - count; i++) {
				if (less(i + 1, i, array)) {
					exchg(i + 1, i, array);
					swapped = true;
				}
			}
			if (!swapped)
				break;

			swapped = false;
			for (int i = array.length - 1; i > count; i--) {
				if (less(i, i - 1, array)) {
					exchg(i - 1, i, array);
					swapped = true;
				}
			}
			count++;
			
		} while (swapped);

	}

}
