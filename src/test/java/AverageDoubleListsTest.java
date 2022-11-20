import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        AverageDoubleLists listNew = new AverageDoubleLists();
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(4.0,5.0));
        double expected = 2;
        assertEquals(expected, listNew.count(arr));
    }

    @Test
    void sum() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(2.0,4.0,6.0));
        double expected = 12.0;
        AverageDoubleLists listNew = new AverageDoubleLists();
        assertEquals(expected, listNew.sum(arr));
    }

    @Test
    void average() {
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(4.0,6.0,2.0));
        double expected = 4.0;
        AverageDoubleLists listNew = new AverageDoubleLists();
        assertEquals(expected, listNew.average(arr));
    }
}