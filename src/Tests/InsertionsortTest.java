package Tests;

import Application.Ordena;
import org.junit.Assert;
import org.junit.Test;

public class InsertionsortTest {

    @Test
    public void testInsertionSort() {
        // Test case 1: Array vazio
        int[] array1 = {};
        int[] expected1 = {};
        int[] result1 = Ordena.insertionSort(array1);
        Assert.assertArrayEquals(expected1, result1);

        // Test case 2: Array com elementos em ordem crescente
        int[] array2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        int[] result2 = Ordena.insertionSort(array2);
        Assert.assertArrayEquals(expected2, result2);

        // Test case 3: Array com elementos em ordem decrescente
        int[] array3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        int[] result3 = Ordena.insertionSort(array3);
        Assert.assertArrayEquals(expected3, result3);

        // Test case 4: Array com elementos desordenados
        int[] array4 = {3, 1, 4, 2, 5};
        int[] expected4 = {1, 2, 3, 4, 5};
        int[] result4 = Ordena.insertionSort(array4);
        Assert.assertArrayEquals(expected4, result4);

        // Test case 5: Array com elementos duplicados
        int[] array5 = {3, 1, 4, 2, 4, 5};
        int[] expected5 = {1, 2, 3, 4, 4, 5};
        int[] result5 = Ordena.insertionSort(array5);
        Assert.assertArrayEquals(expected5, result5);
    }
}