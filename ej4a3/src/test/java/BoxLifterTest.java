import org.junit.jupiter.api.*;
import java.io.*;

public class BoxLifterTest {

    @Test
    public void testLiftBoxesOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BoxLifter.liftBoxes(3);

        String expected = String.join(System.lineSeparator(),
            "Lifting box 1",
            "Lifting box 2",
            "Lifting box 3"
        ) + System.lineSeparator();

        Assertions.assertEquals(expected, outContent.toString());
    }

   
    @Test
    public void testLiftOneBox() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BoxLifter.liftBoxes(1);

        String expected = "Lifting box 1" + System.lineSeparator();
        Assertions.assertEquals(expected, outContent.toString());
    }

    @Test
    public void testLiftFiveBoxes() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BoxLifter.liftBoxes(5);

        String expected = String.join(System.lineSeparator(),
            "Lifting box 1",
            "Lifting box 2",
            "Lifting box 3",
            "Lifting box 4",
            "Lifting box 5"
        ) + System.lineSeparator();

        Assertions.assertEquals(expected, outContent.toString());
    }
}
