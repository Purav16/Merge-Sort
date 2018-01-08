import java.util.Scanner;

/**
 * @author Sain Technology Solutions
 * 
 * Solution to Problem - https://www.hackerrank.com/challenges/insertionsort1
 *
 */
public class InsertionSort1 {
	
	/**
	 * Prints the all elements of input array.
	 */
	private static void printArray(int[] arr) {
		for(int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	/**
	 * Inserts the last unsorted element of array to its right place to make it sorted.
	 */
	public static void insertIntoSorted(int[] elems) {
		final int length = elems.length;
		
		// No movement of elements will be required if-
		// 	- There is just one element in array
		//	- Array is already sorted
		if(length < 2 || elems[length - 2] < elems[length - 1]) {
			return;
		}
		// Store the last element
		final int unsortedNumber = elems[length - 1];
		int i = length - 2;
		// Keep shifting elements to right unless we meet a number less than unsorted number
		for(; i >= 0 && elems[i] > unsortedNumber; i--) {
			elems[i + 1] = elems[i];
			printArray(elems);
		}
		// Replace the number with unsorted number
		elems[i + 1] = unsortedNumber;
		printArray(elems);
	}
	
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		
		final int[] elems = new int[N];
		for(int i = 0; i < N; i++) {
			elems[i] = in.nextInt();
		}
		in.close();
		
		insertIntoSorted(elems);
	}
}