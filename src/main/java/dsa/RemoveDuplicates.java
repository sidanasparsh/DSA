package dsa;

public class RemoveDuplicates {


    public int removeDuplicates(int[] nums) {
        int write = 0;
        for (int read = 1; read < nums.length; read++) {
            if (nums[write] != nums[read]){ // nos are different, build the array using write pointer.
                write++;
                nums[write] = nums[read];
            }
        }
        return write +1;
    }
}
