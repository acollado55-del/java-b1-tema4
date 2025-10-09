import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MaxVolumeToolSelectionTest {

    @Test
    void testExampleSelection() {
        List<Double> volumes = Arrays.asList(15.0, 30.0, 25.0, 300.0, 100.0, 200.0, 40.0, 70.0, 50.0, 160.0);
        List<Double> weights = Arrays.asList(8.0, 18.0, 10.0, 120.0, 75.0, 150.0, 12.0, 20.0, 25.0, 80.0);
        double maxWeight = 500.0;

        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> actual = MaxVolumeToolSelection.findBestToolSet(volumes, weights, maxWeight);

        assertEquals(expected, actual);
    }
}
