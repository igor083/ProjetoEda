package Application;

import java.util.Arrays;

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
			array[indexMenor] = aux;}
		}
		return array;
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

}
