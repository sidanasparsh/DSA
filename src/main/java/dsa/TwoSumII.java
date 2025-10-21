package dsa;
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
 */
public class TwoSumII {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i=0; i<numbers.length; i++) {
                int index = performBinarySearch(numbers,i+1, target-numbers[i]);
                if (index != -1) {
                    return new int[]{i+1, index+1};
                }
            }
            return new int[]{-1,-1};
        }
        private int performBinarySearch(int[] numbers, int start, int target) {
            int end = numbers.length-1;
            while(start<=end) {
                int mid = (start + end)/2;
                if (numbers[mid]==target) {
                    return mid;
                }
                else if (target>numbers[mid]) {
                    start = mid+1;
                }
                else
                    end = mid-1;
            }
            return -1;
        }
    }
}
