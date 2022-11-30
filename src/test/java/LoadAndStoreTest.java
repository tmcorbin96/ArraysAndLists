import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.
    LoadAndStore laod = new LoadAndStore();
//    String text1 = ;
//    String text2 = ;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    LoadAndStore ls = new LoadAndStore();
    @Test
    void loadIntArrayFromFileTest() {

        int[] expected = {4,5,6,11,13,8,9,7,14,18};
        int[] actual = ls.loadIntArrayFromFile("/Users/taylor/Projects/ArraysAndLists/testIntegerData1.txt");
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadDoubleArrayFromFile() {
        double [] expected = {4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123};
        double [] actual = ls.loadDoubleArrayFromFile("/Users/taylor/Projects/ArraysAndLists/testDoubleData2.txt");
        assertEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayListFromFile() {
        assertEquals(null, "");
    }
}