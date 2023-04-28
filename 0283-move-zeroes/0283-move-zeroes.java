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