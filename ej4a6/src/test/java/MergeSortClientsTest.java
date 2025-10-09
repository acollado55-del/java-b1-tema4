import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MergeSortClientsTest {

    @Test
    public void testAlreadySorted() {
        // Tests a case where the array is already sorted in ascending order.
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReversedOrder() {
        // Tests an array sorted in descending order, which should be reversed to ascending.
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testWithDuplicates() {
        // Tests that the sorter correctly handles repeated values.
        int[] input = {3, 1, 3, 2, 1, 3};
        int[] expected = {1, 1, 2, 3, 3, 3};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElement() {
        // Tests that a single-element array remains unchanged.
        int[] input = {99};
        int[] expected = {99};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        // Tests that sorting an empty array does not cause errors.
        int[] input = {};
        int[] expected = {};
        MergeSortClients.mergeSort(input, 0, input.length - 1); // Should not crash
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNegativeValues() {
        // Tests that negative numbers are correctly sorted.
        int[] input = {-2, 0, 4, -7, 3};
        int[] expected = {-7, -2, 0, 3, 4};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAllElementsEqual() {
        // Tests that an array where all elements are equal remains unchanged after sorting.
        int[] input = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlternatingValues() {
        // Tests sorting on an array with alternating high and low values.
        int[] input = {10, 1, 9, 2, 8, 3, 7, 4};
        int[] expected = {1, 2, 3, 4, 7, 8, 9, 10};
        MergeSortClients.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}
