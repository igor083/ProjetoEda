package Tests;

import Application.Ordena;
import org.junit.Assert;
import org.junit.Test;

public class HeapsortTest {

    @Test
    public void testHeapSort() {
        // Test case 1: Array vazio
        int[] array1 = {};
        int[] expected1 = {};
        Ordena.heapSort(array1);
        Assert.assertArrayEquals(expected1, array1);

        // Test case 2: Array com um único elemento
        int[] array2 = {1};
        int[] expected2 = {1};
        Ordena.heapSort(array2);
        Assert.assertArrayEquals(expected2, array2);

        // Test case 3: Array com elementos em ordem crescente
        int[] array3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        Ordena.heapSort(array3);
        Assert.assertArrayEquals(expected3, array3);

        // Test case 4: Array com elementos em ordem decrescente
        int[] array4 = {5, 4, 3, 2, 1};
        int[] expected4 = {1, 2, 3, 4, 5};
        Ordena.heapSort(array4);
        Assert.assertArrayEquals(expected4, array4);

        // Test case 5: Array com elementos desordenados
        int[] array5 = {3, 1, 4, 2, 5};
        int[] expected5 = {1, 2, 3, 4, 5};
        Ordena.heapSort(array5);
        Assert.assertArrayEquals(expected5, array5);

        // Test case 6: Array com elementos duplicados
        int[] array6 = {3, 1, 4, 2, 4, 5};
        int[] expected6 = {1, 2, 3, 4, 4, 5};
        Ordena.heapSort(array6);
        Assert.assertArrayEquals(expected6, array6);
    }

    @Test
    public void testHeapify() {
        int[] array = {4, 10, 3, 5, 1};
        int n = array.length;

        Ordena.heapify(array, n, 0);
        int[] expected1 = {10, 5, 3, 4, 1};
        Assert.assertArrayEquals(expected1, array);

        Ordena.heapify(array, n, 1);
        int[] expected2 = {10, 5, 3, 4, 1};
        Assert.assertArrayEquals(expected2, array);

        Ordena.heapify(array, n, 2);
        int[] expected3 = {10, 5, 3, 4, 1};
        Assert.assertArrayEquals(expected3, array);

        Ordena.heapify(array, n, 3);
        int[] expected4 = {10, 5, 3, 4, 1};
        Assert.assertArrayEquals(expected4, array);

        Ordena.heapify(array, n, 4);
        int[] expected5 = {10, 5, 3, 4, 1};
        Assert.assertArrayEquals(expected5, array);
    }
}