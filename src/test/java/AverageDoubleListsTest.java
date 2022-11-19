import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        AverageDoubleLists listNew = new AverageDoubleLists();
        String []    arr = {"roll", "bounce"};
        double expected = 2;
        assertEquals(expected, listNew.count(arr));
    }

    @Test
    void sum() {
        assertEquals(null, "");
    }

    @Test
    void average() {
        assertEquals(null, "");
    }
}