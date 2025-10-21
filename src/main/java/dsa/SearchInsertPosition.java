package dsa;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
            if (nums[mid] == target)
                return mid;
            if (target > nums[mid])
                start = mid+1;
            if (target < nums[mid])
                end = mid -1;
        }
        return start; // returning start because we need to return the index where it would be inserted, if we return end, it will give index of smaller element.
    }
}
