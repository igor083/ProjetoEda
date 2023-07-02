package Application;

import java.util.Random;

public class Ordena {

	public static int[] insertionSort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int i = j - 1;
			while ((i > -1) && (array[i] > array[j])) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = array[j];
		}
		return array;
	}

	public static int[] selectionSort(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			int indexMenor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[indexMenor])
					indexMenor = j;

				int aux = array[i];
				array[i] = array[indexMenor];
				array[indexMenor] = aux;
			}
		}
		return array;

	}

	public static int[] mergeSort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		return divide(array, 0, array.length - 1);
	}

	private static int[] divide(int[] array, int left, int right) {
		if (left == right) {
			return new int[] { array[left] };
		}

		int mid = left + (right - left) / 2;

		int[] leftArray = divide(array, left, mid);
		int[] rightArray = divide(array, mid + 1, right);
		int[] result = merge(leftArray, rightArray);

		return result;
	}

	private static int[] merge(int[] leftArray, int[] rightArray) {
		int leftLen = leftArray.length;
		int rightLen = rightArray.length;
		int[] ans = new int[leftLen + rightLen];
		int i = 0, j = 0, k = 0;

		while (i < leftLen && j < rightLen) {
			if (leftArray[i] < rightArray[j]) {
				ans[k] = leftArray[i];
				++i;
			} else {
				ans[k] = rightArray[j];
				++j;
			}

			++k;
		}

		while (i < leftLen) {
			ans[k] = leftArray[i];
			++i;
			++k;
		}

		while (j < rightLen) {
			ans[k] = rightArray[j];
			++j;
			++k;
		}

		return ans;
	}
	
	public static void quickSort(int[] A) {
		quickSort(A, 0, A.length-1);
	}
	
	private static void quickSort(int[] A, int low, int high) {
		if (low < high+1) {
			int p = partition(A, low, high);
			quickSort(A, low, p-1);
			quickSort(A, p+1, high);
		}
	}

	private  static void swap(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;		
	}
	
	
	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}


	private static int partition(int[] A, int low, int high) {
		swap(A, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (A[i] < A[low]) {
				swap(A, i, border++);
			}
		}
		swap(A, low, border-1);
		return border-1;
	}
	
}
