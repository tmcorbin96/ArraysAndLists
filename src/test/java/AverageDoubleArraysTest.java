import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        AverageDoubleArrays arrayNew = new AverageDoubleArrays();
        double [] arr = {1,2};
        double expected = 2;
        assertEquals(expected, arrayNew.count(arr));
    }

    @Test
    void sum() {
        AverageDoubleArrays arrayNew = new AverageDoubleArrays();
        double [] arr = {1,2};
        double expected = 3;
        assertEquals(expected, arrayNew.sum(arr));
    }

    @Test
    void average() {
        AverageDoubleArrays arrayNew = new AverageDoubleArrays();
        double [] arr = {4,6};
        double expected = 5;
        assertEquals(expected, arrayNew.average(arr));
    }
}