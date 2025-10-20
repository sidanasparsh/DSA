package DSATests;

import dsa.NeedleInHaystack;
import dsa.RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionsTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength = 5;
        int newLength = solution.removeDuplicates(nums);
        assertEquals(expectedLength, newLength);

        int[] expected = {0, 1, 2, 3, 4};
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
        // write test case for NeedleInHaystack class
    @Test
    public void testStrStr() {
        NeedleInHaystack solution = new NeedleInHaystack();
        String haystack = "hello";
        String needle = "ll";
        int expectedIndex = 2;
        int actualIndex = solution.strStr(haystack, needle);
        assertEquals(expectedIndex, actualIndex);

        haystack = "aaaaa";
        needle = "bba";
        expectedIndex = -1;
        actualIndex = solution.strStr(haystack, needle);
        assertEquals(expectedIndex, actualIndex);
    }
}
