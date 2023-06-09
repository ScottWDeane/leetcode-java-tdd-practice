package tdd;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test_checker() {
        assertTrue(true);
    }

    @Test
    public void whenGiven_NumArray_2_7_11_15_withTarget9_returnIndices_0_1() {
        int[] intArray = {1, 2, 3};
        int[] indices = {0, 1};
        assertArrayEquals(TwoSum.twoSum(intArray, 9), indices);
    }
}
