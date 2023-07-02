package Tests;

import Application.Ordena;
import org.junit.Assert;
import org.junit.Test;

public class SelectionsortTest {

    @Test
    public void testSelectionSort() {
        // Test case 1: Array vazio
        int[] array1 = {};
        int[] expected1 = {};
        Ordena.selectionSort(array1);
        Assert.assertArrayEquals(expected1, array1);

        // Test case 2: Array com um único elemento
        int[] array2 = {1};
        int[] expected2 = {1};
        Ordena.selectionSort(array2);
        Assert.assertArrayEquals(expected2, array2);

        // Test case 3: Array com elementos em ordem crescente
        int[] array3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        Ordena.selectionSort(array3);
        Assert.assertArrayEquals(expected3, array3);

        // Test case 4: Array com elementos em ordem decrescente
        int[] array4 = {5, 4, 3, 2, 1};
        int[] expected4 = {1, 2, 3, 4, 5};
        Ordena.selectionSort(array4);
        Assert.assertArrayEquals(expected4, array4);

        // Test case 5: Array com elementos desordenados
        int[] array5 = {3, 1, 4, 2, 5};
        int[] expected5 = {1, 2, 3, 4, 5};
        Ordena.selectionSort(array5);
        Assert.assertArrayEquals(expected5, array5);

        // Test case 6: Array com elementos duplicados
        int[] array6 = {3, 1, 4, 2, 4, 5};
        int[] expected6 = {1, 2, 3, 4, 4, 5};
        Ordena.selectionSort(array6);
        Assert.assertArrayEquals(expected6, array6);
    }
}