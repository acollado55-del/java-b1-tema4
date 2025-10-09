import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ProductEfficiencySorterTest {

    @Test
    public void testAlreadySorted() {
        // Tests a case where the array is already sorted in ascending order.
        double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testReversedOrder() {
        // Tests an array sorted in descending order, which should be reversed to ascending.
        double[] input = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testWithDuplicates() {
        // Tests that the sorter correctly handles repeated values.
        double[] input = {7.0, 2.0, 7.0, 3.0, 2.0, 7.0};
        double[] expected = {2.0, 2.0, 3.0, 7.0, 7.0, 7.0};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testSingleElement() {
        // Tests that a single-element array returns the same single element.
        double[] input = {42.0};
        double[] expected = {42.0};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testEmptyArray() {
        // Tests that sorting an empty array returns another empty array.
        double[] input = {};
        double[] expected = {};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void testNegativeValues() {
        // Tests the sorting of an array that contains negative, zero, and positive values.
        double[] input = {-5.0, -1.0, -10.0, 0.0, 3.0};
        double[] expected = {-10.0, -5.0, -1.0, 0.0, 3.0};
        double[] result = ProductEfficiencySorter.sortByEfficiency(input.clone());
        assertArrayEquals(expected, result, 0.0001);
    }
}
