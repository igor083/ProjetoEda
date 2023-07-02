package Application;

import java.util.Arrays;
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

	public static void selectionSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[iMin])
					iMin = j;
			if (i != iMin) {
				int temp = array[i];
				array[i] = array[iMin];
				array[iMin] = temp;
			}
		}
	}

	public static int[] countingSort(int array[]) {
		int maiorNumero = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maiorNumero)
				maiorNumero = array[i];
		}

		int[] balde = new int[maiorNumero+1];

		for (int j = 0; j < array.length; j++) {
			balde[array[j]]++;
		}

		int arrPos = 0;
		for (int c = 0; c < balde.length; c++) {
			for (int j = 0; j < balde[c]; j++) {
				array[arrPos] = c;
				arrPos++;
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

	public static int[] divide(int[] array, int left, int right) {
		if (left == right) {
			return new int[] { array[left] };
		}

		int mid = left + (right - left) / 2;

		int[] leftArray = divide(array, left, mid);
		int[] rightArray = divide(array, mid + 1, right);
		int[] result = merge(leftArray, rightArray);

		return result;
	}

	public static int[] merge(int[] leftArray, int[] rightArray) {
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

	public static void heapSort(int[] array) {
		int n = array.length;

		// Construir o heap máximo
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		// Extrair elementos um por um do heap
		for (int i = n - 1; i >= 0; i--) {
			// Mover a raiz atual para o final
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			// Chamar heapify na subárvore reduzida
			heapify(array, i, 0);
		}
	}

	public static void heapify(int[] array, int n, int i) {
		int largest = i; // Inicializar a raiz como o maior elemento
		int left = 2 * i + 1; // Filho esquerdo
		int right = 2 * i + 2; // Filho direito

		// Se o filho esquerdo é maior que a raiz
		if (left < n && array[left] > array[largest]) {
			largest = left;
		}

		// Se o filho direito é maior que a raiz
		if (right < n && array[right] > array[largest]) {
			largest = right;
		}

		// Se o maior não for a raiz
		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			// Recursivamente chamar heapify na subárvore afetada
			heapify(array, n, largest);
		}
	}
}
