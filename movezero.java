/* 283. Move Zeroes
Easy
11.7K
292
Companies
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 */


class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }

            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        
        
    }
}
