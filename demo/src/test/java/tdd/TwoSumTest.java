package tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test_checker() {
        assertTrue(true);
    }

    @Test
    public void whenGiven_NumArray_2_7_11_15_withTarget_9_returnIndices_0_1() {
        int[] intArray = {2, 7, 11, 15};
        int target = 9;
        int[] expectedIndices = {0, 1};
        assertArrayEquals(TwoSum.twoSum(intArray, target), expectedIndices);
    }

    @Test
    public void whenGiven_NumArray_3_2_4_withTarget_6_returnIndices_1_2() {
        int[] intArray = {3, 2, 4};
        int target = 6;
        int[] expectedIndices = {1, 2};
        assertArrayEquals(TwoSum.twoSum(intArray, target), expectedIndices);
    }

    @Test
    public void whenGiven_NumArray_3_3_withTarget_6_returnIndices_0_1() {
        int[] intArray = {3, 3};
        int target = 6;
        int[] expectedIndices = {0, 1};
        assertArrayEquals(TwoSum.twoSum(intArray, target), expectedIndices);
    }
}
