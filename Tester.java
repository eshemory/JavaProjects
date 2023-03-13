package exam5;

import java.util.Random;

public class Tester {

	/**
	 * Utility for shuffling any array
	 * 
	 * @param array
	 */
	public static void shuffle(int[] array) {
		Random rand = new Random();

		for (int i = 1; i < array.length; i++) {
			int r = rand.nextInt(i);
			int temp = array[i];
			array[i] = array[r];
			array[r] = temp;
		}
	}

	/**
	 * Prints out the contents of the array
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Checks if the array is sorted. Throws an exception if it isn't
	 * 
	 * @param array
	 */
	public static void checkIfSorted(int[] array) {
		try {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1])
					throw new Exception("Array not sorted!");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		int runs = 3;
		int i = runs+1;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		do {
			System.out.println("\nRUN #" + (i-runs));
			shuffle(arr);
			System.out.println("Before...");
			printArray(arr);
			checkIfSorted(arr);
			Sorter.cocktailShakerSort(arr);
			System.out.println("After...");
			printArray(arr);
			checkIfSorted(arr);
			runs--;
		} while (runs > 0);
		
	}

}
