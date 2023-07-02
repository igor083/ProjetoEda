package Tests;

import Application.Ordena;
import org.junit.Assert;
import org.junit.Test;

public class MergesortTest {

    @Test
    public void testMergeSort() {
        // Test case 1: Array vazio
        int[] array1 = {};
        int[] expected1 = {};
        int[] result1 = Ordena.mergeSort(array1);
        Assert.assertArrayEquals(expected1, result1);

        // Test case 2: Array com um único elemento
        int[] array2 = {1};
        int[] expected2 = {1};
        int[] result2 = Ordena.mergeSort(array2);
        Assert.assertArrayEquals(expected2, result2);

        // Test case 3: Array com elementos em ordem crescente
        int[] array3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        int[] result3 = Ordena.mergeSort(array3);
        Assert.assertArrayEquals(expected3, result3);

        // Test case 4: Array com elementos em ordem decrescente
        int[] array4 = {5, 4, 3, 2, 1};
        int[] expected4 = {1, 2, 3, 4, 5};
        int[] result4 = Ordena.mergeSort(array4);
        Assert.assertArrayEquals(expected4, result4);

        // Test case 5: Array com elementos desordenados
        int[] array5 = {3, 1, 4, 2, 5};
        int[] expected5 = {1, 2, 3, 4, 5};
        int[] result5 = Ordena.mergeSort(array5);
        Assert.assertArrayEquals(expected5, result5);

        // Test case 6: Array com elementos duplicados
        int[] array6 = {3, 1, 4, 2, 4, 5};
        int[] expected6 = {1, 2, 3, 4, 4, 5};
        int[] result6 = Ordena.mergeSort(array6);
        Assert.assertArrayEquals(expected6, result6);
    }

    @Test
    public void testDivide() {
        int[] array = {5, 3, 1, 4, 2};
        int left = 0;
        int right = array.length - 1;

        int[] expected = {5};
        int[] result = Ordena.divide(array, left, left);
        Assert.assertArrayEquals(expected, result);

        expected = new int[]{3, 5};
        result = Ordena.divide(array, left, left + 1);
        Assert.assertArrayEquals(expected, result);

        expected = new int[]{1, 3, 5};
        result = Ordena.divide(array, left, left + 2);
        Assert.assertArrayEquals(expected, result);

        expected = new int[]{4};
        result = Ordena.divide(array, left + 3, left + 3);
        Assert.assertArrayEquals(expected, result);

        expected = new int[]{2, 4};
        result = Ordena.divide(array, left + 3, left + 4);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testMerge() {
        int[] leftArray = {1, 3, 5};
        int[] rightArray = {2, 4, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = Ordena.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expected, result);
    }
}