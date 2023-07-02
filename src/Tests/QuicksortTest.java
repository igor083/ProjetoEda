package Tests;

import Application.Ordena;
import org.junit.Assert;
import org.junit.Test;

public class QuicksortTest {

    @Test
    public void testQuickSort() {
        // Test case 1: Array com elementos em ordem crescente
        int[] array1 = {1, 2, 3, 4, 5};
        int[] expected1 = {1, 2, 3, 4, 5};
        Ordena.quickSort(array1);
        Assert.assertArrayEquals(expected1, array1);

        // Test case 2: Array com elementos em ordem decrescente
        int[] array2 = {5, 4, 3, 2, 1};
        int[] expected2 = {1, 2, 3, 4, 5};
        Ordena.quickSort(array2);
        Assert.assertArrayEquals(expected2, array2);

        // Test case 3: Array com elementos aleatórios
        int[] array3 = {4, 2, 5, 1, 3};
        int[] expected3 = {1, 2, 3, 4, 5};
        Ordena.quickSort(array3);
        Assert.assertArrayEquals(expected3, array3);
    }
}