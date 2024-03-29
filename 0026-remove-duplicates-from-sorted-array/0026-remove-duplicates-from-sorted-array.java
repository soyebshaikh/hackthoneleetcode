class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 1;
        for(int i = 0 ; i < nums.length -1 ; i++ ){
            if(nums[i] != nums[i + 1]){         //When we get unique No.
                nums[ptr] = nums[i+1];          //update previous pointer with new element
                ptr++;
            }
        }
        return ptr ;
    }
}