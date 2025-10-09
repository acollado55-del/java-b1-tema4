import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeliverySorterTest {

    @Test
    public void testBubbleSortDescending_original() {
        int[] input = {45, 30, 55, 20, 40, 35, 60, 25, 50, 15};
        int[] expected = {60, 55, 50, 45, 40, 35, 30, 25, 20, 15};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlreadySortedDescending() {
        int[] input = {90, 80, 70, 60, 50};
        int[] expected = {90, 80, 70, 60, 50};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortedAscending() {
        int[] input = {10, 20, 30, 40, 50};
        int[] expected = {50, 40, 30, 20, 10};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElement() {
        int[] input = {42};
        int[] expected = {42};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testTwoElementsDescending() {
        int[] input = {100, 50};
        int[] expected = {100, 50};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testTwoElementsAscending() {
        int[] input = {50, 100};
        int[] expected = {100, 50};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testWithDuplicates() {
        int[] input = {30, 20, 30, 40, 40, 10};
        int[] expected = {40, 40, 30, 30, 20, 10};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAllSameValues() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};

        DeliverySorter.bubbleSortDescending(input);
        assertArrayEquals(expected, input);
    }
}
